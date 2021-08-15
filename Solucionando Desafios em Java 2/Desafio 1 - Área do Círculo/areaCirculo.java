/*
Solucionando Desafios em Java

Exercicio 1 -  Área do Círculo

Realizado por Henrique Marchioni 15/08/2021

 */

import java.util.Scanner;

public class areaCirculo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //declare suas variaveis do tipo
        var raio = scan.nextDouble();

        //continue a solucao

       var area = 3.14159 * (Math.pow(raio,2));

        System.out.printf("A=%.4f\n", area);
    }
}