package model;

import java.util.Comparator;

public class BallParcialEdad implements Comparator<Perro>{

	public BallParcialEdad() {
	}

	
	public int compare(Perro o1, Perro o2) {
		return o1.getEdad() - o2.getEdad();
	}

}
