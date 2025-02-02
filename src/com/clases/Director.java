package com.clases;

public class Director extends Gerente{
	
	private double acciones;
	
	public Director() {
		super();
	}

	public Director(String nombre, int identificador, double salario, double bono, double acciones) {
		super(nombre, identificador, salario, bono);
		this.acciones = acciones;
	}

	public double getAcciones() {
		return acciones;
	}

	public void setAcciones(double acciones) {
		this.acciones = acciones;
	}
	

	public double calculaSalarioTotal() {
		double salario=super.getSalario();
		double bono=super.getBono();
		double sum= salario+bono;
		double total = sum+=this.getAcciones();
		return total;
	}
	
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Acciones: "+this.getAcciones());
	}
	
}
