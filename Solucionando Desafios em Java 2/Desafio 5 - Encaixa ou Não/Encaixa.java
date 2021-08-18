import java.io.IOException;
import java.util.Scanner;

/*
Solucionando Desafios em Java

Exercício 5 - Encaixa ou Não?

Realizado por Henrique Marchioni 18/08/2021

 */

public class Encaixa {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

//continue a solucao

        for (int i = 0; i < N; i++) {
            String A = leitor.next();
            String B = leitor.next();

            int ta = A.length();
            int tb = B.length();



            if ((ta >= tb) && B.equals(A.substring(ta - tb)) )
                System.out.println("encaixa");
            else
                System.out.println("nao encaixa");
        }
    }

}