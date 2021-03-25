package Exercicios.Exercicio01T;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int numero = 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println( " " + i);
        }

  
        
    }
}
