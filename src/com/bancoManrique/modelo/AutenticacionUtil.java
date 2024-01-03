package com.bancoManrique.modelo;

public class AutenticacionUtil {
	private int contraseña;
	
	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}
	
	public boolean autentica(int contraseña) {
		if(this.contraseña == contraseña) {
			System.out.println("autenticado");
			return true;
		}else {
			return false;
		}

	}
}
