package Estudo.PraticandoProgramacaoEmJava.Dio2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Praticando programação em Java

exercicio 2 -  Conjunto Bons ou Ruins?

realizado por Henrique Marchioni 23/04/2021

 */



public class MinhaPrimeiraClasse {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String valorPassado;
        Palavra palavra = new Palavra();

        while (!"0".equals((valorPassado = br.readLine()))) {

            palavra.palavrasAdc(valorPassado);
        }

        palavra.getResultado();


    }


    static class Palavra{

        private int nPalavras= -1;
        private List<String> frases = new ArrayList<>();
        private List<String> resultado = new ArrayList<>();

        public void palavrasAdc(String valor ) {

            if (!valor.matches("[a-z]*")) {
                nPalavras = Integer.parseInt(valor);
                frases.clear();
            }
            else {
                frases.add(valor);
                nPalavras--;
                if (nPalavras==0)palavraTeste();
            }
        }

        public void getResultado() {
            for (String resposta: resultado) {
                System.out.println(resposta);
            }
        }

        private void palavraTeste() {
            frases = frases.stream().sorted().collect(Collectors.toList());
            for (var i=1;i<frases.size();i++) {
                if (frases.get(i-1).startsWith(frases.get(i)) || frases.get(i).startsWith(frases.get(i-1)) ) {
                    resultado.add("Conjunto Ruim");
                    return;
                }
            }
            resultado.add("Conjunto Bom");
        }
    }
}