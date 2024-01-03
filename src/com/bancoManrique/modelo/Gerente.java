package com.bancoManrique.modelo;

public class Gerente extends Funcionario implements Autenticable {
	
	private AutenticacionUtil referencia;
	
	public Gerente() {
		this.referencia = new AutenticacionUtil();
	}

	@Override
	public double getBonificacion() { 
		return super.getSalario();
	}
	
	@Override
	public void SetContraseña(int contraseña) {
		this.referencia.setContraseña(contraseña);
	}
	
	@Override
	public boolean iniciarSesion(int contraseña) {
		return this.referencia.autentica(contraseña);
	}
	
	@Override
	public boolean transferir(double valor, Cuenta destino) {
		// TODO Auto-generated method stub
		return super.transferir(valor, destino);
	}



	
	
}
