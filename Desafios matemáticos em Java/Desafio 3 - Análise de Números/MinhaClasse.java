/*
Desafios matemáticos em Java

exercicio 3 -  Análise de Números

realizado por Henrique Marchioni 18/06/2021

 */

import java.util.Scanner;

public class MinhaClasse {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;


        for (int i = 0 ; i < 5;i++) {
          int valor =  leitor.nextInt();
          if (valor % 2 == 0) {
              par++;
          } else impar++;
          if (Double.isNaN( Math.sqrt(valor))) {
              negativo++;
          } else if (valor !=0) {
              positivo++;
          }
        }


        System.out.println( par + " valor(es) par(es)");
        System.out.println( impar + " valor(es) impar(es)");
        System.out.println( positivo + " valor(es) positivo(s)");
        System.out.println( negativo + " valor(es) negativo(s)");
    }
}