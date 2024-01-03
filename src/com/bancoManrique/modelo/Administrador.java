package com.bancoManrique.modelo;

public class Administrador extends Funcionario implements Autenticable {

	AutenticacionUtil referencia;
	

	@Override
	public void SetContraseña(int contraseña) {
		this.referencia.setContraseña(contraseña);
		
	}

	@Override
	public boolean iniciarSesion(int contraseña) {
		return this.referencia.autentica(contraseña);
	}

	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean transferir(double valor, Cuenta destino) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
