package br.edu.saolucas.modelos;

public class Bovina {
	
	String tipo;
	String data_nasc;
	float peso_inicial;
	float peso_final;
	String raca;
	
	
	public String pegarTipo() {
		return tipo;
	}
	
	public void atribuirTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String pegarData_nasc() {
		return data_nasc;
	}
	
	public void atribuirData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	public float pegarPeso_inicial() {
		return peso_inicial;
	}
	
	public void atribuirPeso_inicial(float peso_inicial) {
		this.peso_inicial = peso_inicial;
	}
	public float pegarPeso_final() {
		return peso_final;
	}
	
	public void atribuirPeso_final(float peso_final) {
		this.peso_final = peso_final;
	}
	
	public String pegarRaca() {
		return raca;
	}
	
	public void atribuirRaca(String raca) {
		this.raca = raca;
	}
}
