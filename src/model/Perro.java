package model;

import processing.core.PApplet;

public class Perro implements Comparable<Perro> {
	private int ID, edad, posX, posY;
	private String nombre, raza, fecha;
	private PApplet app;

	public Perro(int ID, String nombre, int edad, String raza, String fecha, PApplet app) {
		this.ID = ID;
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.fecha = fecha;
		this.posX = 300;
		this.posY = 250;
		this.app = app;
	}

	public void draw(int posY) {
		app.textSize(20);
		app.text(ID + " " + nombre + " " + edad + " " + raza + " " + fecha, this.posX, posY);

	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int compareTo(Perro idSiguiente) {
		return this.ID - idSiguiente.getID();
	}

}
