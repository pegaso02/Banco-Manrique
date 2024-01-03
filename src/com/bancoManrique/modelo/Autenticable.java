package com.bancoManrique.modelo;


public interface Autenticable {
	
	public void SetContraseña(int contraseña);
	
	public boolean iniciarSesion(int contraseña);
}
