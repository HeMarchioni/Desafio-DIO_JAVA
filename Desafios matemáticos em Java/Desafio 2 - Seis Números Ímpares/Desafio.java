/*
Desafios matemáticos em Java

exercicio 2 -  Análise de Números

realizado por Henrique Marchioni 17/06/2021

 */

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int cont = 0;


        while (cont < 6 ) {
            if ( x % 2  == 1) {
                System.out.println(x);
                cont++ ;
            }
            x++;
        }
    }

}