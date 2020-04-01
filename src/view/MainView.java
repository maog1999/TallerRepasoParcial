package view;

import controller.ControllerView;
import processing.core.PApplet;

public class MainView extends PApplet {

	private ControllerView controllerView;

	public static void main(String[] args) {
		PApplet.main("view.MainView");
	}

	public void settings() {
		size(800, 800);
	}

	public void setup() {
		controllerView = new ControllerView(this);
	}

	public void draw() {
		controllerView.draw();
	}

	public void mouseClicked() {
		controllerView.ordernar();
	}
}
