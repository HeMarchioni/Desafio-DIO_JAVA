/*
Solucionando Desafios em Java

Exercicio 1 -  Diferença

Realizado por Henrique Marchioni 18/06/2021

 */

import java.util.Scanner;

public class DesafioDiferenca {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();


        var dife = (a * b - c * d);

        System.out.println("DIFERENCA = "+ dife);
    }

}