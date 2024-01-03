package com.bancoManrique.modelo;

public abstract class Funcionario { // ABSTRACTA NO SE PUEDE INSTANCIAR
	
	private double salario;
	private double saldo;
	private int contraseña;

	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}
	
	public boolean iniciarsesion(int contraseña) {
		if (this.contraseña == contraseña) {
			return true;
		} else {
			return false;
		}
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public abstract double getBonificacion();


	public boolean transferir(double valor, Cuenta destino) {
		// TODO Auto-generated method stub
		return false;
	}
	
	// REGARGAR SALDO
	public void recargar(double valor){
		this.saldo += valor;
	}
	
	// METODO RETIRAR
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	// METODO OBTENER SALDO
	public double getSaldo() { //LLAMAMOS GET A UN METODO QUE RETORNA EL VALOR DE UNA VARIABLE PRIVADA
		return this.saldo;
	}
}
