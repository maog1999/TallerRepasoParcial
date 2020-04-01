package model;

import java.util.Comparator;

public class BallParcialRaza implements Comparator<Perro> {

	public BallParcialRaza() {
	}

	public int compare(Perro o1, Perro o2) {
		return o1.getRaza().compareTo(o2.getRaza());
	}

}
