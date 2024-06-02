package capitulo02.exercicios;

import java.util.Scanner;

public class ParImpar {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("Digite um inteiro: ");
      int n = input.nextInt();

      if (n % 2 == 0) {
         System.out.printf("%d é par.", n);
      }
      if (n % 2 != 0) {
         System.out.printf("%d é ímpar.", n);
      }
   } // end main
} // end class
