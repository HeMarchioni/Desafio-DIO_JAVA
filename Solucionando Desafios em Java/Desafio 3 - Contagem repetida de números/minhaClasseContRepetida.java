/*
Solucionando Desafios em Java

Exercício 3 - Contagem repetida de números

Realizado por Henrique Marchioni 22/06/2021

 */

import java.util.*;

public class minhaClasseContRepetida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> variavel  = new ArrayList<>();
        Map<Integer, Integer> numeros = new TreeMap<>();
        int cont = 0;
        int n = sc.nextInt();

        while (n > cont) {
            int n1 = sc.nextInt();
            variavel.add(n1);
            numeros.put(n1, 0);
            cont++;
        }

        for (Map.Entry<Integer, Integer> entrada : numeros.entrySet()) {
            while (variavel.contains(entrada.getKey())) {
                variavel.remove(entrada.getKey());
                numeros.put(entrada.getKey(), entrada.getValue() + 1);
            }
            System.out.println(entrada.getKey() + " aparece "+ entrada.getValue()+" vez(es)");
        }
        sc.close();
    }
}