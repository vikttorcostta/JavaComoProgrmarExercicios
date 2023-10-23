package Capitulo2;
import java.util.Scanner;
//Calcula o produto de tres inteiros

public class CalculaProdutoDeTresInteiros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        int y;
        int z;
        int resultado;

        System.out.print("Entre com o primeiro número");
        x = entrada.nextInt();//leitura do primeiron numero
        System.out.print("Entre com segundo número");
        y = entrada.nextInt();
        System.out.print("Entre com o terceiro número");
        z = entrada.nextInt();

        resultado = x * y * z;//resultado final
        System.out.printf("O PRODUTO É %d\n", resultado);

    }
}
