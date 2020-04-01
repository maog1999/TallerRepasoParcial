package model;

import java.util.Comparator;

public class BallParcialNombre implements Comparator<Perro> {

	public BallParcialNombre() {
	}

	
	public int compare(Perro o1, Perro o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
