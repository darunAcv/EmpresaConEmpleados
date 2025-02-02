package com.clases;

public class Empleado {
	
	//Atributos
	private String nombre;
	private int identificador;
	private double salario;
	
	
	//constructores
	
	public Empleado() {
	}
	
	public Empleado(String nombre, int identificador, double salario) {
		this.nombre = nombre;
		this.identificador = identificador;
		this.salario = salario;
	}

	//G Y S 
	//nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//id
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	//salario
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//metodos
	
	public double calculaSalarioTotal() {
		double total = this.getSalario() * 160;
		return total;
	}
	
	public void mostrarInformacion() {
		System.out.println("***INFORMACIÓN***");
		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Identificador: "+this.getIdentificador());
		System.out.println("Salario mensual: "+this.calculaSalarioTotal());
	}

	
	
}
