package com.bancoManrique.test;

import com.bancoManrique.modelo.Administrador;
import com.bancoManrique.modelo.Gerente;
import com.bancoManrique.modelo.SistemaInterno;

public class TestSistemaInterno {

	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente juan = new Gerente();
		Administrador fernando = new Administrador();
		
		sistema.autentica(juan);
		sistema.autentica(fernando);
	}

}
