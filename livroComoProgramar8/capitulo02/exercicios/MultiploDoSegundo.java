package capitulo02.exercicios;

import java.util.Scanner;

public class MultiploDoSegundo {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("First integer: ");
      int n1 = input.nextInt();

      System.out.print("Secound integer: ");
      int n2 = input.nextInt();

      if (n1 % n2 == 0) {
         System.out.printf("%d é multiplo de %d%n", n1, n2);
      }
      if (n1 % n2 != 0) {
         System.out.printf("%d não é multiplo de %d%n", n1, n2);
      }
   }
}
