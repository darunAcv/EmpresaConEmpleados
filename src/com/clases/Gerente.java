package com.clases;

public class Gerente extends Empleado {
	private double bono;
	
	public Gerente() {
		
	}

	public Gerente(double bono) {
		super();
		this.bono = bono;
	}
	
	public Gerente(String nombre, int identificador, double salario, double bono) {
		super(nombre, identificador, salario);
	}
	
	public double getBono() {
		return bono;
	}

	public void setBono(double bono) {
		this.bono = bono;
	}

	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Bono: "+this.getBono());
		
	}
	

	public double calculaSalarioTotal() {
		double salario= super.getSalario();
		double bono= this.getBono();
		double total = salario+bono;
		return total;
	}
	
	
	
	
}
