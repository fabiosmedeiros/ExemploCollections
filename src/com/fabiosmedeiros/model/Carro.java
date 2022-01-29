package com.fabiosmedeiros.model;

/**
 * Model Carro
 * Implementando a interface comparable, pois desta forma, 
 * podemos chamar o método sort.
 * Por exemplo : Collections.sort(listaDeCarros);
 * @author Fabio
 * @version 1.0
 */
public class Carro implements Comparable<Carro> {
	private String modelo;
	private int ano;
	private String cor;
	private double consumo;
	
	public Carro() {
		
	}
	
	public Carro(String modelo, int ano, String cor, double consumo) {
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.consumo = consumo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	@Override
	public int compareTo(Carro carro) {
		return this.getModelo().compareTo(carro.getModelo());
	}
	
	@Override
	public String toString() {
		String strCarro = "[retorno{";
		strCarro += "Modelo:" + this.modelo + ",";
		strCarro += "Ano:" + this.ano + ",";
		strCarro += "Cor:" + this.cor + ",";
		strCarro += "Consumo: " + this.consumo;
		strCarro += "}]";
		
		return strCarro; 
	}
}
