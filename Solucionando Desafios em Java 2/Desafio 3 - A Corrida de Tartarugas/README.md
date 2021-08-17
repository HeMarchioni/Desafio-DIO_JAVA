# Desafio-DIO - Solucionando Desafios em Java


<h1>Desafio - 2 Média 3</h1>
Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ". Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno.

<h2>Entrada</h2>
A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.

<h2>Saída</h2>
Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens devem ser impressas conforme a descrição do problema. Não esqueça de imprimir o enter após o final de cada linha, caso contrário obterá "Presentation Error".


| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
|  2.0 4.0 7.5 8.0 <br> 6.4| Media: 5.4<br> Aluno em exame.<br> Nota do exame: 6.4 <br> Aluno aprovado. <br> Media final: 5.9|
|  2.0 6.5 4.0 9.0 | Media: 4.8<br> Aluno reprovado.|
