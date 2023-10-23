package Capitulo2;
import java.util.Scanner;
//Calcula o produto de tres inteiros

public class CalculaProdutoDeTresInteiros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//Pacote de entrada de dados
        int x; //declaração de variaveis
        int y;
        int z;
        int resultado;

        System.out.print("Entre com o primeiro número");
        x = entrada.nextInt();//leitura do primeiro número
        System.out.print("Entre com segundo número");
        y = entrada.nextInt();//leitura do segundo numero
        System.out.print("Entre com o terceiro número");
        z = entrada.nextInt();//leitura do terceiro nuemero

        resultado = x * y * z;//resultado final
        System.out.printf("O PRODUTO É %d\n", resultado);

    }
}
