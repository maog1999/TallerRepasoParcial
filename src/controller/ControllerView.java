package controller;

import model.Logic;
import processing.core.PApplet;

public class ControllerView {

	private Logic logic;
	
	public ControllerView(PApplet app) {
		logic = new Logic(app);
	}

	public void draw() {
		logic.draw();
	}

	public void ordernar() {
		logic.ordenar();
	}

	

}
