package Capitulo2;

//fig 2.7: Addition.java
//Programa de adição que exibe a soma de dois números

import java.util.Scanner;
//importação do pacote

public class Addition {
	
	public static void main(String[] args) {
		
		//cria scanner para obter entrada a partir da janela de comando
		Scanner entradaDeDados = new Scanner (System.in);
		//o escanner é atribuido a variavel -> entradaDeDados para ser utilizada posteriormente na obtenção de dados
		
		int primeiro_numero; //primeiro numero a somar
		int segundo_numero; //segundo numero a somar
		int resultado_da_soma; //soma de primeiro_numero e segundo_numero
		
		System.out.print("Entre com primeiro numero-> ");
		primeiro_numero = entradaDeDados.nextInt();//faz a leitura do primeiro numero fornecido pelo usuario
		
		System.out.print("Entre com os segundo numero-> ");
		segundo_numero = entradaDeDados.nextInt(); //faz a leitura do segundo numero fornecido pelo usuario
		
		resultado_da_soma = primeiro_numero + segundo_numero;//faz a soma dos dois numeros fornecidos e armazanados nas respectivas variaveis
		
		System.out.printf("A soma é: %d\n", resultado_da_soma);
		
	}//fim do metodo principal
	
}//fim da classe Addition
