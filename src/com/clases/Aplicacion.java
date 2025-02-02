package com.clases;

public class Aplicacion {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Juan", 1111, 8);
		Gerente gerente1 = new Gerente("José", 2222, 6500, 1000);
		Director director1 = new Director("Anna", 9999, 7000, 1000, 12);

		empleado1.mostrarInformacion();
		System.out.println("-------------------");
		gerente1.mostrarInformacion();
		System.out.println("-------------------");
		director1.mostrarInformacion();
		System.out.println("-------------------");
	}

}
