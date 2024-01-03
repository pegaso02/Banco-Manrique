package com.bancoManrique.test;

import com.bancoManrique.modelo.*;

public class TestCuentas {
	public static void main(String[] args) {
		
	Gerente ge = new Gerente();
	Administrador ad = new Administrador();
	Contador con = new Contador();
	CuentaAhorros ca = new CuentaAhorros(ge);
	CuentaCorriente co = new CuentaCorriente(ad);
	CuentaCorriente cuentaContador = new CuentaCorriente(con);
	
//	ca.depositar(10000);
//	ca.transferir(20000, co);
	cuentaContador.depositar(20000);
	cuentaContador.transferir(21000,ca);
	
	}
}
