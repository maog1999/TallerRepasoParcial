package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class BallParcialFecha implements Comparator<Perro> {

	public BallParcialFecha() {
	}

	
	public int compare(Perro o1, Perro o2) {
		DateFormat f = new SimpleDateFormat("dd-MM-yyyy");
		Date fecha1 = null;
		Date fecha2 = null;
		try {
			fecha1 = f.parse(o1.getFecha());
			fecha2 = f.parse(o2.getFecha());
		}catch (Exception e) {
			e.printStackTrace();
		}
		return fecha1.compareTo(fecha2);
	}

}
