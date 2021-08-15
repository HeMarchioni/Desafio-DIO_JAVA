import java.io.IOException;
import java.util.Scanner;

/*
Desafios numéricos em Java

exercício 3 -   Contagem de Cédulas

realizado por Henrique Marchioni 15/08/2021

 */


public class ContCedulas {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int notasInseridas = leitor.nextInt();
        int atual = notasInseridas;
        int notas100 = atual / 100;
        atual -= notas100 * 100;
        int notas50 = atual / 50 ;
        atual -= notas50 * 50 ;
        int notas20 = atual / 20;
        atual -= notas20 *20 ;
        int notas10 =  atual / 10 ;
        atual -= notas10 * 10  ;
        int notas5 = atual / 5;
        atual -= notas5 * 5 ;
        int notas2 = atual / 2;
        atual -= notas2 * 2;
        int notas1 = atual;

        System.out.print(notasInseridas + "\n"
                +notas100+" nota(s) de R$ 100,00\n"
                +notas50+" nota(s) de R$ 50,00\n"
                +notas20+" nota(s) de R$ 20,00\n"
                +notas10+" nota(s) de R$ 10,00\n"
                +notas5+" nota(s) de R$ 5,00\n"
                +notas2+" nota(s) de R$ 2,00\n"
                +notas1+" nota(s) de R$ 1,00");
    }
}