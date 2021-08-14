import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


/*
Desafios numéricos em Java

exercício 2 -   Folha de Pagamento

realizado por Henrique Marchioni 14/08/2021

 */



public class FolhaPagamento {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int numberFunci = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int horasTrab = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double salarioHora = Double.parseDouble(st.nextToken());

        double salary = salarioHora * horasTrab; // Altere o valor da variável com o cálculo esperado
        System.out.println("NUMBER = " + numberFunci);
        System.out.printf("SALARY = U$ %.2f", salary);
    }
}