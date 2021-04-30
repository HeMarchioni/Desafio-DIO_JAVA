package Estudo.PraticandoProgramacaoEmJava.Dio1;

/*
Praticando programação em Java

exercicio 1 -  Abreviando posts do blog

realizado por Henrique Marchioni 21/04/2021

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class MinhaPrimeiraClasse {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fraseOriginal;

        while (!".".equals((fraseOriginal = br.readLine()))) {
            StringTokenizer st = new StringTokenizer(fraseOriginal);
            Palavras palavras = new Palavras();
            palavras.trocaPalavra(st, fraseOriginal);
        }
    }

    static class Palavras {

        private final Map<Character, String> listaAbreviacao = new HashMap<>();
        private int contador = 0;
        private StringBuilder palavraAbreviada = new StringBuilder();


        public void imprimiPalavrasAbreviadas() {
            var palavraUsadas = palavraAbreviada.toString().split(",");
            var sorted = Arrays.stream(palavraUsadas).sorted();
            sorted.forEach(System.out::println);
        }

        public void imprimiContador() {
            System.out.println(contador);
        }

        public void trocaPalavra(StringTokenizer st, String frase) {
            String fraseFinal = frase;
            var travaPonto = st.countTokens();

            while (st.hasMoreTokens()) {
                var palavra = st.nextToken().toLowerCase();
                var letra = palavra.charAt(0);

                if (!listaAbreviacao.containsValue(palavra) && !listaAbreviacao.containsKey(letra) && (palavra.length() > 2)) {// ñ contem palavra e ñ contem a letra e palavra > 2
                    listaAbreviacao.put(letra, palavra);
                    fraseFinal = fraseFinal.replaceAll("\\b" + palavra + "\\b", letra + "."); // procuro na frase a palavra nova q ñ foi abreviada e troca por sua abreviação
                    contador++;
                    palavraAbreviada.append(letra).append(". = ").append(palavra).append(",");

                } else if (!listaAbreviacao.containsValue(palavra) && listaAbreviacao.containsKey(letra) && (palavra.length() > 2)) { // ñ contem a palavra e contem a letra(ja foi abreviada) e palavra > 2
                    int qtAbre,qtNova ;
                    String [] arrayString = fraseFinal.split(" ");
                    qtAbre = (int) Arrays.stream(arrayString).filter(valor -> valor.equals(letra+".")).count(); // conta o numero de vezes q aparece a palavra abreviada na frase
                    qtNova = (int) Arrays.stream(arrayString).filter(valor -> valor.equals(palavra)).count(); // conta o numero de vezes q aparece a nova palavra na frase

                    var pos=((listaAbreviacao.get(letra).length()*qtAbre) - (qtAbre*2)) - ((palavra.length()*(qtNova)) - ((qtNova)*2)); // palavra abreviado multiplicado pelo numero de vezes q aparece é maior ou menor que a palavra nova multiplicado pelas vezes q aparece
                    if (pos >= 0) {   // -> palavra abreviada maior ou igual entra e ñ realiza nada (retorna o loop)
                        continue;
                    } else { // se a palavra nova é maior que a anterior
                        fraseFinal = fraseFinal.replaceAll(letra + "\\.", listaAbreviacao.get(letra)); // procuro na frase a palavra anteriormente abreviada e troca por sua forma completa
                        fraseFinal = fraseFinal.replaceAll("\\b" + palavra + "\\b", letra + "."); // procuro na frase a palavra nova q ñ foi abreviada e troca por sua abreviação
                        palavraAbreviada = new StringBuilder(palavraAbreviada.toString().replaceAll(listaAbreviacao.get(letra),palavra)); // procuro na String com as palavras abreviadas a palavra q era abreviada e a troco pela nova
                        listaAbreviacao.put(letra, palavra);  // -> atualizo a lista das palavras abrevidas
                    }
                }
            }
            System.out.println(fraseFinal);
            imprimiContador();
            imprimiPalavrasAbreviadas();
        }
    }
}






