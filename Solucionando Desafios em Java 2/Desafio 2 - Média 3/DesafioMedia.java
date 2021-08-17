/*
Solucionando Desafios em Java

Exercicio 2 - Média 3

Realizado por Henrique Marchioni 17/08/2021

 */

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class DesafioMedia {

    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        float n1,n2,n3,n4,media;
        double exame,mediafinal;

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();
        media = ((n1*2)+(n2*3)+(n3*4)+n4)/10;

        System.out.printf("Media: %.1f\n",media);

        //continue a solucao de acordo com o enunciado

        if ( media >= 7.0 ){
            System.out.print("Aluno aprovado.\n");
        }
        else if ( media < 5.0  ){
            System.out.print("Aluno reprovado.\n");
        }
        else if (media >= 5.0 && media <= 6.9 ){
            System.out.print("Aluno em exame.\n");
            exame = sc.nextDouble();

            System.out.printf("Nota do exame: %.1f\n",exame);
            mediafinal =((media + exame) / 2.0);


            if( mediafinal >=5 ){
                System.out.print("Aluno aprovado.\n");
            }
            else{
                System.out.print("Aluno reprovado\n");
            }
            System.out.printf("Media final: %.1f\n",mediafinal);
        }

        sc.close();
    }
}