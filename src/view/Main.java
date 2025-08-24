package view;

import controller.DistroController;

public class Main {
	public Main() {
		super();
	}

	public static void main(String[] args) {
		DistroController distro = new DistroController();
		System.out.println(distro.exibeDistro());
	}
}
