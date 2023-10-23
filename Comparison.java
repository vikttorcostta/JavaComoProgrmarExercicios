package Capitulo2;
//fig. 2.15 Comparison.java
//Comapara inteiros utilizando instruções if, operadores relacionais
//e operadores de igualdade

import java.util.Scanner;//Programa utiliza a classe Scanner

public class Comparison {
	
	//metodo princiapal inicia a execução do programa
	public static void main(String[] args) {
		
		Scanner entradaDeDados = new Scanner(System.in);
		
		int primeiroNumero;//primeiro numero a comparar
		int segundoNumero;//segundo numero a comparar
		
		System.out.print("Entre com o primeiro numero-> ");
		primeiroNumero  = entradaDeDados.nextInt();//ler o primeiro numero fornecido pelo usuario
		
		System.out.print("Entre com o primeiro numero-> ");
		segundoNumero = entradaDeDados.nextInt();//ler o segundo numero fornecido pelo usuario
		
		//blocos de decisão com if
		if(primeiroNumero == segundoNumero)
			System.out.printf("%d == %d\n", primeiroNumero, segundoNumero);
		
		if(primeiroNumero != segundoNumero)
			System.out.printf("%d != %d\n", primeiroNumero ,segundoNumero);
	
		if(primeiroNumero < segundoNumero)
			System.out.printf("%d < %d\n", primeiroNumero, segundoNumero);
		
		if(primeiroNumero > segundoNumero)
			System.out.printf("%d > %d\n", primeiroNumero, segundoNumero);
		
		if(primeiroNumero <= segundoNumero)
			System.out.printf("%d  <= %d\n", primeiroNumero, segundoNumero);
		
		if(primeiroNumero >= segundoNumero)
			System.out.printf("%d >= %d\n",primeiroNumero, segundoNumero);

	}//fim do metodo principal

}//fim da classe Comparison
