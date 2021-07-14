/*

exercício 3 -  Quantidade de Números Positivos

realizado por Henrique Marchioni 14/07/2021

 */

import java.util.Scanner;

public class MinhaClasseQtaNumerosPositovos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int positivo = 0;
        int cont = 0;

        while ( cont < 6 ) {

            float valor =  leitor.nextFloat();
          if (valor > 0) {
              positivo++;
          }
          cont++;
        }
        System.out.println( positivo + " valores positivos");
    }
}