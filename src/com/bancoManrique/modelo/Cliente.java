package com.bancoManrique.modelo;
//MODIFICADORES PUBLIC PRIVATE 
public abstract class Cliente implements Autenticable {

	private String nombre;
	private String documento;
	private int agencia; //POR DEFECTO TIENE VALOR 0
	
	private static int contador = 0; // LA DEFINIMOS STATIC PORQUE VA SER DE LA CLASE MAS NO VA SER ALTERADA POR LAS INSTANCIAS
	
	// CONSTRUCTOR
	public  Cliente(int Agencia) { // SE OBLIGA A INICIALIZAR LA CLASE CLIENTE CON UN NUMERO DE AGENCIA MAYOR A 0
		if(Agencia <= 0) {
			System.out.println("numero invalido tu agencia es la numero 1");
			this.agencia = 1;
		}else {
			this.agencia =Agencia;
			contador++;
			System.out.println("hemos creado "+contador+" clientes");
		}
	}
	
	// SETTER NOMBRE 
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// GETTER NOMBRE
	public String getNombre() {
		return nombre;
	}
	
	// SETTER DOCUMENTO
	void setDocumento(String documento) {
		this.documento = documento;
	}
	
	// GETTER DOCUMENTO
	public String getDocumento() {
		return documento;
	}
	
	// SETTER AGENCIA
//	void setAgencia(int agencia) {       // NO ES PERMITIDO SETIAR AGENCIA, PARA ESO SE CREO EL CONSTRUCTOR LINEA 9 
//		if(agencia > 0) {              
//			this.agencia = agencia;
//		}else {
//			System.out.println("numero invalido");
//		}
//	}
	
	//GETTER AGENCIA
	public int getAgencia() {
		return agencia;
	}

}
