package Exercicios;

import java.util.Scanner;

public class Exercicio02Pro {

    static void mostrarResultado(double resultado){
        System.out.println("----------");
        System.out.println(" Resultado : ");
        System.out.println(resultado);
        System.out.println("----------");
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double resultado = 0;
        System.out.println(" Digite tres numeros ");
        double n1 = entrada.nextInt();
        double n2 = entrada.nextInt();
        double n3 = entrada.nextInt();

        resultado = (n1 + n2) / n3;

        mostrarResultado(resultado);
        System.out.println(" Digite outro numero ");

        int n4 = entrada.nextInt();
        resultado = resultado + n4;
        mostrarResultado(resultado);
        entrada.close();
    }

}
