package com.bancoManrique.modelo;

public class CuentaCorriente extends Cuenta {



	public CuentaCorriente(Funcionario cargo) {
		super(cargo);
		// TODO Auto-generated constructor stub
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
