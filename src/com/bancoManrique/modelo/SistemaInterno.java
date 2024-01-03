package com.bancoManrique.modelo;

public class SistemaInterno {
	public int clave;
	
	public boolean autentica(Autenticable contraseña) {
		boolean puedeIniciarSesion = contraseña.iniciarSesion(clave);
		if(puedeIniciarSesion) {
			System.out.println("login exitoso");
			return true;
		}else {
			System.out.println("contraseña incorrecta");
			return false;
		}
	}
}
