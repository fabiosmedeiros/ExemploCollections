package com.fabiosmedeiros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.fabiosmedeiros.model.Carro;

/**
 * Classe Principal, para executar todo o fluxo do programa. 
 * @author Fabio
 * @version 1.0
 */
public class Principal {

	public static void main(String[] args) {
		/* Declarando um Collection do tipo HashMap.
		 * A interface Map não dispõe de métodos da interface Collection.
		 */
		Map<Integer, String> tipoCollection = new HashMap<>();
		// Adicionando elementos.
		tipoCollection.put(1, "List");
		tipoCollection.put(2, "Set");
		tipoCollection.put(3, "Map");
		tipoCollection.put(4, "Stream");
		
		System.out.println("***** Digite uma opção - Exemplos de Collection *****");
		
		// Iterando sobre os elementos do tipoCollection.
		for (Map.Entry<Integer, String> entry: tipoCollection.entrySet()) {
			System.out.println(entry);
		}
		
		// Criando uma instância da classe Scanner, para ler entrada do teclado.
		Scanner scann = new Scanner(System.in);
		// Lendo a entrada do teclado, para saber a opção escolhida.
		String opcao = scann.next();
		
		// Enquanto um número válido não for digitado, loop.
		while (!isNumeric(opcao)) {
			System.out.println("Por favor digite um número.");
			
			opcao = scann.next();
		}
		
		switch (opcao) {
		case "1":
			System.out.println("Opção selecionada - " + opcao);
			System.out.println("****************************************");
			System.out.println("Cadastro de Carros. Travalhando com collection List");
			System.out.println("****************************************");
			System.out.println("");
			
			// Instanciando uma lista para armazenar objetos do tipo Carro.
			List<Carro> carros = new ArrayList<>();
			boolean continua = true;
			
			// Enquanto continua for verdadeiro, loop.
			while (continua) {
				// Instanciando um novo Carro.
				Carro umCarro = new Carro();
				
				// Exibindo mensagens, e setando variáveis através do setters.
				System.out.println("Digite o modelo: ");
				umCarro.setModelo(scann.next());			
				System.out.println("Digite o ano: ");
				
				String ano = scann.next();
				
				while (!isNumeric(ano)) {
					System.out.println("Por favor, digite apenas números.");
					
					ano = scann.next();
				}
				
				umCarro.setAno(Integer.parseInt(ano));			
				System.out.println("Digite a cor: ");
				
				String cor = scann.next();
				
				umCarro.setCor(cor);
				
				System.out.println("Digite o consumo");
				
				String consumo = scann.next();
				
				while (!isNumeric(consumo)) {
					System.out.println("Por favor, digite apenas números.");
					consumo = scann.next();
				}
				
				umCarro.setConsumo(Double.parseDouble(consumo));
				// Adicionando o Carro a coleção.
				carros.add(umCarro);
				
				System.out.println("Cadastrar outro carro ?");
				System.out.println("1 - Sim");
				System.out.println("2 - Não");
				
				String strContinua = scann.next();
				
				// Enquanto um número válido não for digitado, loop.
				while (!isNumeric(strContinua)) {
					System.out.println("Por favor, digite apenas números.");
					System.out.println("Cadastrar outro carro ?");
					System.out.println("1 - Sim");
					System.out.println("2 - Não");
					strContinua = scann.next();
				}
				
				// Comparando a String e setando a variável continua. 
				if (strContinua.equals("1")) {
					continua = true;
				} else {
					continua = false;
				}
			}
			
			System.out.println("***** Dados recebidos: " );
			
			// Com a implementação da interface Comparable, é possível execuar este método.
			Collections.sort(carros);
			
			// Printando a lista de carros, ordenada por modelo.
			for (Carro carro : carros) {
				System.out.println(carro);
			}
			break;
		case "2":
			System.out.println("Opção selecionada - " + opcao);
			break;
		case "3":
			System.out.println("Opção selecionada - " + opcao);
			break;
		case "4":
			System.out.println("Opção selecionada - " + opcao);
			break;
		default:
			break;
		}
		
		// Fechando o Scanner.
		scann.close();
	}
	
	/**
	 * Função pra verificar se caractere é numérico.
	 * @param strNumero
	 * @return true or false
	 */
	public static boolean isNumeric(String strNumero) { 
		try {
			Double.parseDouble(strNumero);
			return true;
		} catch(NumberFormatException e) {  
			return false;
		}
	}
	
}
