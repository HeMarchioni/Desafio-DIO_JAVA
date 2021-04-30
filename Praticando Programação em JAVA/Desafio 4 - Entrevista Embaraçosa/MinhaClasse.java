package Estudo.PraticandoProgramacaoEmJava.Dio4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*      Praticando programação em Java

        exercicio 4 -  Entrevista embaraçosa

        realizado por Henrique Marchioni 23/04/2021

        */

public class MinhaClasse {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String valorPassado = null;
        Palavra palavra = new Palavra();

        while ((valorPassado = br.readLine()) != null)  {

            palavra.concertaPalavra(valorPassado);
        }
    }

    public static class Palavra {

        public void concertaPalavra(String palavra ) {

            var trava = 0;
            for(int i=0; i <= palavra.length() - 1; i++) {
                if( palavra.substring(0, i).endsWith(palavra.substring(i)) ) {
                    System.out.println(palavra.substring(0, i));
                    trava = 1;
                }
            }
            if(trava == 0)
                System.out.println(palavra);
        }
    }
}

