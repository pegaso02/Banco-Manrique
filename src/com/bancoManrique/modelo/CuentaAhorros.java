package com.bancoManrique.modelo;

public class CuentaAhorros extends Cuenta {

	

	public CuentaAhorros(Funcionario cargo) {
		super(cargo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		super.depositar(valor);
	}

	@Override
	public void transferir(double valor, Cuenta destino) {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("saldo insuficiente");
		} else {
			this.saldo -= valor;
			destino.depositar(valor);
		}
	}

}
