import java.io.IOException;
import java.util.*;

/*
Solucionando Desafios em Java

Exercicio 4 - Combinação de strings

Realizado por Henrique Marchioni 18/08/2021

 */

public class CombString {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();


        for (int i = 0; i < N+1; i++) {

            String N2 = leitor.nextLine();

            String[] palavras = (N2.split(" "));

            if (palavras.length == 2) {


                int t1 = palavras[0].length();
                int t2 = palavras[1].length();
                int max = Math.max(t1, t2);
                StringBuilder resultado = new StringBuilder();

                for (int j = 0; j < max; j++) {

                    if (t1 > j) {
                        resultado.append(palavras[0].charAt(j));
                    }
                    if (t2 > j) {
                        resultado.append(palavras[1].charAt(j));
                    }
                }
                System.out.println(resultado);
            }

        }
    }

}
