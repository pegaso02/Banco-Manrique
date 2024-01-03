package com.bancoManrique.modelo;

public class ControlBonificacion {
	private double acumulado;
	
	public double registroBonificacion(Funcionario nombre) {
		this.acumulado += nombre.getBonificacion();
		System.out.println("El acumulado de bonificaciones a hoy es: "+ acumulado);
		return this.acumulado;
	}
}
