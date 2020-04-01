package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import processing.core.PApplet;
import processing.core.PImage;

public class Logic {

	private PApplet app;
	private String[] infoPerroUno;
	private String[] infoPerroDos;
	private LinkedList<Perro> listPerritos;
	private BallParcialNombre ballParcialNombre;
	private BallParcialEdad ballParcialEdad;
	private BallParcialRaza ballParcialRaza;
	private BallParcialFecha ballParcialFecha;
	private PImage imagen1;
	private PImage imagen2;
	private int pantalla;

	public Logic(PApplet app) {
		this.app = app;
		listPerritos = new LinkedList<Perro>();
		ballParcialNombre = new BallParcialNombre();
		ballParcialEdad = new BallParcialEdad();
		ballParcialRaza = new BallParcialRaza();
		ballParcialFecha = new BallParcialFecha();
		pantalla = 0;
		cargaInfo();
		crearInfo();
		crearTxt();
	}

	public void cargaInfo() {
		infoPerroUno = app.loadStrings("./data/imports/datosUNO.txt");
		infoPerroDos = app.loadStrings("./data/imports/datosDOS.txt");
		imagen1 = app.loadImage("images/interfaz1.jpg");
		imagen2 = app.loadImage("images/interfaz2.jpg");
		// System.out.println(infoPerroUno[1]);
	}

	private void crearInfo() {
		for (int i = 0; i < infoPerroUno.length; i++) {
			String[] info1 = infoPerroUno[i].split(",");

			for (int j = 0; j < infoPerroDos.length; j++) {
				String[] info2 = infoPerroDos[j].split(",");

				if (info2[0].equals(info1[0])) {
					int ID = Integer.parseInt(info1[0]);
					int edad = Integer.parseInt(info1[2]);
					String nombre = info1[1];
					String raza = info2[1];
					String fecha = info2[2];

					listPerritos.add(new Perro(ID, nombre, edad, raza, fecha, app));
					// System.out.println(info1[0]);

				}

			}
		}
	}

	public void draw() {
		switch (this.pantalla) {
		case 0:
			app.image(imagen1, 0, 0);

			for (int i = 0; i < listPerritos.size(); i++) {
				listPerritos.get(i).draw(i * (50) + 200);
			}
			break;

		case 1:
			app.image(imagen2, 0, 0);
		}
	}

	public void crearTxt() {
		try {
			File myObj = new File("./ordenID.txt");
			if (myObj.createNewFile()) {
				System.out.println("Se creo: " + myObj.getName());
			} else {
				System.out.println("Ya existe");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Metodos para crear los txt segun la caracteristica
	public void infoID() {
		try {
			FileWriter myWriter = new FileWriter("./data/exports/ordenID.txt");
			for (Perro perritosNue : listPerritos) {
				myWriter.write(perritosNue.getID() + " " + perritosNue.getNombre() + " " + perritosNue.getEdad() + " "
						+ perritosNue.getRaza() + " " + perritosNue.getFecha() + "\n");

			}
			myWriter.close();
			System.out.println("Se escribio correctamente");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void infoName() {
		try {
			FileWriter myWriter = new FileWriter("./data/exports/ordenName.txt");
			for (Perro perritosNue : listPerritos) {
				myWriter.write(perritosNue.getID() + " " + perritosNue.getNombre() + " " + perritosNue.getEdad() + " "
						+ perritosNue.getRaza() + " " + perritosNue.getFecha() + "\n");

			}
			myWriter.close();
			System.out.println("Se escribio correctamente2");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void infoEdad() {
		try {
			FileWriter myWriter = new FileWriter("./data/exports/ordenEdad.txt");
			for (Perro perritosNue : listPerritos) {
				myWriter.write(perritosNue.getID() + " " + perritosNue.getNombre() + " " + perritosNue.getEdad() + " "
						+ perritosNue.getRaza() + " " + perritosNue.getFecha() + "\n");

			}
			myWriter.close();
			System.out.println("Se escribio correctamente3");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void infoRaza() {
		try {
			FileWriter myWriter = new FileWriter("./data/exports/ordenRaza.txt");
			for (Perro perritosNue : listPerritos) {
				myWriter.write(perritosNue.getID() + " " + perritosNue.getNombre() + " " + perritosNue.getEdad() + " "
						+ perritosNue.getRaza() + " " + perritosNue.getFecha() + "\n");

			}
			myWriter.close();
			System.out.println("Se escribio correctamente4");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void infoFecha() {
		try {
			FileWriter myWriter = new FileWriter("./data/exports/ordenFecha.txt");
			for (Perro perritosNue : listPerritos) {
				myWriter.write(perritosNue.getID() + " " + perritosNue.getNombre() + " " + perritosNue.getEdad() + " "
						+ perritosNue.getRaza() + " " + perritosNue.getFecha() + "\n");

			}
			myWriter.close();
			System.out.println("Se escribio correctamente5");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void ordenar() {

		switch (this.pantalla) {
		case 0:
			if (app.mouseX > 695 && app.mouseX < 790 & app.mouseY > 15 && app.mouseY < 40) {
				pantalla = 1;
			}
			if (app.mouseX > 60 && app.mouseX < 150 & app.mouseY > 150 && app.mouseY < 232) {
				Collections.sort(listPerritos);// ID
				infoID();
				System.out.println("guarda");
			}
			if (app.mouseX > 60 && app.mouseX < 150 & app.mouseY > 275 && app.mouseY < 358) {
				Collections.sort(listPerritos, ballParcialNombre);
				infoName();
			}
			if (app.mouseX > 60 && app.mouseX < 150 & app.mouseY > 400 && app.mouseY < 484) {
				Collections.sort(listPerritos, ballParcialEdad);
				infoEdad();
			}
			if (app.mouseX > 60 && app.mouseX < 150 & app.mouseY > 525 && app.mouseY < 608) {
				Collections.sort(listPerritos, ballParcialRaza);
				infoRaza();
			}
			if (app.mouseX > 60 && app.mouseX < 150 & app.mouseY > 650 && app.mouseY < 735) {
				Collections.sort(listPerritos, ballParcialFecha);
				infoFecha();
			}
			break;

		case 1:
			if (app.mouseX > 510 && app.mouseX < 540 & app.mouseY > 235 && app.mouseY < 265) {
				pantalla = 0;
			}
		}

	}
}
