package com.bancoManrique.modelo;

public abstract class Cuenta { // NO SE PUEDEN CREAR INSTANCIAS CON CUENTA
	String nombre;
	private Cliente id; // SOLO ACCESO DESDE LA CLASE LOCAL
	private String direccion;
	private String documento; // ENCAPSULAMOS DOCUMENTO
	protected double saldo;  // SOLO LECTURA PARA CLASES HIJAS
	//private static int contador = 0; // CONTADOR DEBE SER STATIC, PARA QUE CADA VEZ Q SE CREA UNA CUENTA, no se crea un nuevo total, 
																												//manteniendo el valor correcto.
	
	//CONSTRUCTOR PARA INICIALIZAR OBJETOS
	public Cuenta(Funcionario cargo) {

	}
	
	
	// METODO RETIRAR
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	// METODO OBTENER SALDO
	public double getSaldo() { //LLAMAMOS GET A UN METODO QUE RETORNA EL VALOR DE UNA VARIABLE PRIVADA
		return this.saldo;
	}
	
	// METODO TRANSFERIR
		public abstract void transferir(double valor,Cuenta destino); // ABSTRACTA NO TIENE CUERPO Y DEBE SER DEFINIDA EN CADA CLASE HIJA
	
		// METODO DEPOSITAR
		public void depositar(double valor) {
			this.saldo += valor;
		}
		
		// METODO SETIAR PRIVADOS DIRECCION // SETTER
		public void setDireccion(String Direccion) {
			this.direccion = Direccion;
		}
					// GETTER
		public String getDireccion() {
			return direccion;
		}
		
		// METODO SETIAR PRIVADOS DOCUMENTO
		
		public void setDocumento(String Documento){
			this.documento = Documento;
		}
		
		public String getDocumento() {
			return documento;
		}
		
		public Cliente getReferencia() {
			return id;
		}
		
		public void setReferencia(Cliente referencia) {
			this.id = referencia;
		}
		
		
}
