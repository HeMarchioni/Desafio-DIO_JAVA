/*
Solucionando Desafios em Java

Exercicio 2 - Idades

Realizado por Henrique Marchioni 18/06/2021

 */

import java.io.IOException;
import java.util.Scanner;

public class  DesafioIdades {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int soma = 0;
        var n = leitor.nextInt();
        while (n > 0) {

            soma += n;
            cont++;
            n = leitor.nextInt();
        }
        double media = (double) soma / (double) cont;
        System.out.printf("%.2f%n", media);
    }
}