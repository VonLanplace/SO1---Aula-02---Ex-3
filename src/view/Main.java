package view;

import javax.swing.JOptionPane;

import controller.DistroController;

public class Main {
	public Main() {
		super();
	}

	public static void main(String[] args) {
		DistroController distro = new DistroController();
		JOptionPane.showMessageDialog(null, distro.exibeDistro(), "Distro Checker", 1);
	}
}
