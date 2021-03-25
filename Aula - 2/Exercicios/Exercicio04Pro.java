package Exercicios;

public class Exercicio04Pro {

    static int encontrarMax(int a, int b){
        if(a > b){
            return a;
        }else {
            return b;
        }

    }

    public static void main(String[] args) {
        System.out.println(encontrarMax(8,19));
    }
}
