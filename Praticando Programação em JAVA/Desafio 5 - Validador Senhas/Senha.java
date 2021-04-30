package Estudo.PraticandoProgramacaoEmJava.Dio5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*      Praticando programação em Java

        exercicio 5 -  Validador de senhas com requisitos

        realizado por Henrique Marchioni 25/04/2021

        */

public class Senha {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String valorPassado;
        Senha senha = new Senha();

        while ((valorPassado = br.readLine()) != null) {
            senha.validadorSenha(valorPassado);
        }
    }

    public void validadorSenha(String senha) {
        String senhaVerificar;

        if ((senha.contains(" ")) || !(senha.length() >=6 && senha.length() <=32) ) {
            System.out.println("Senha invalida.");
        } else if (!senha.matches("[A-Za-z0-9]+")) { // verifica se tem letras Maiuscula e minuscula e numeros
            System.out.println("Senha invalida.");
        } else {

            senhaVerificar = senha.replaceAll("[a-z]", "@");
            senhaVerificar = senhaVerificar.replaceAll("[A-Z]", "%");
            senhaVerificar = senhaVerificar.replaceAll("[0-9]", "-");

            if (senhaVerificar.contains("@") && senhaVerificar.contains("%") && senhaVerificar.contains("-")) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }
    }
}