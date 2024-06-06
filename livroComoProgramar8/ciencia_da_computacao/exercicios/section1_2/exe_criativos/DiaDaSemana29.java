
/*
 * 1.2.29 Dia da semana. Escreva um programa que receba uma data
   como entrada e imprima o dia da semana em que essa data cai. 
   Seu programa deve aceitar três argumentos de linha de comando int: m (mês), d (dia) e y (ano). Para m, use 1 para janeiro, 2 para fevereiro e assim por diante. Para saída, imprima 0 para domingo, 1 para segunda, 2 para terça e assim por diante. Use as seguintes fórmulas para o calendário gregoriano:
   
   y0 = y – (14 – m) / 12
   x = y0 + y0/4 – y0/100 + y0/400
   m0 = m + 12 × ((14 – m) / 12) – 2
   d0 = (d + x + (31 × m0) / 12) % 7 
   
   Exemplo: Em que dia da semana caiu 14 de fevereiro de 2000? y0 = 2000 – 1 = 1999
   x = 1999 + 1999/4 – 1999/100 + 1999/400 = 2483
   m0 = 2 + 12 × 1 – 2 = 12
   d0 = (14 + 2483 + (31 × 12) / 12)% 7 = 2500% 7 = 1
   Resposta: Segunda-feira.
   
   Sedgewick, Robert; Wayne, Kevin. Ciência da Computação: Uma Abordagem Interdisciplinar (pp. 47-48). Educação Pearson. Edição do Kindle. 
 */
import java.util.Scanner;

public class DiaDaSemana29 {
   public static void main(String[] args) {

      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // entrada de dados
      System.out.println("Dia da semana.");
      System.out.print("Digite o dia: ");
      int d = input.nextInt();
      System.out.print("Digite o mês: ");
      int m = input.nextInt();
      System.out.print("Informe o ano: ");
      int y = input.nextInt();

      // calcular encontrar dia da semana
      int y0 = y - (14 - m) / 12;
      int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
      int m0 = m + 12 * ((14 - m) / 12) - 2;
      int d0 = (d + x + (31 * m0) / 12) % 7;

      // exibe resultado
      System.out.println(d0);
      System.out.println("Domingo=0, segunda=1, terça=2, quarta=3, \n\tquinta=4, sexta=5, sábado=6");
   } // end main
} // end class
