package Estudo.PraticandoProgramacaoEmJava.Dio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*      Praticando programação em Java

        exercicio 3 -  Encontre a maior substring

        realizado por Henrique Marchioni 23/04/2021

        */


public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String frase1, frase2; //declare suas variaveis aqui
        while (( frase1 = in.readLine()) != null) { // complete seu código
               frase2 = in.readLine();

            int minLength = frase1.length();
            int maxS = minLength;
            boolean f = true;
            while (maxS > 0 && f) { //altere as variaveis, se achar necessario
                int diff = minLength - maxS;
                for (int i = 0; i <= diff;i++ ) { //complete o laco de repeticao
                    if (frase2.contains(frase1.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }

}