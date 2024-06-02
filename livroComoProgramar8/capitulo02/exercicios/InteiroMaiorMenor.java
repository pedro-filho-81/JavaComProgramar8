package capitulo02.exercicios;

/*
 * 
 */
import java.util.Scanner;

import javax.swing.text.Style;

public class InteiroMaiorMenor {

   public static void main(String[] args) {

      // object Scanner input
      Scanner input = new Scanner(System.in);

      // enter data
      System.out.print("Informe o primeiro inteiro: ");
      int n1 = input.nextInt();
      System.out.print("segundo inteiro: ");
      int n2 = input.nextInt();
      System.out.print("Terceiro inteiro: ");
      int n3 = input.nextInt();
      System.out.print("Quarto inteiro: ");
      int n4 = input.nextInt();
      System.out.print("Quinto inteiro: ");
      int n5 = input.nextInt();

      // condições para o
      if (n1 > n2) {
         if (n1 > n3) {
            if (n1 > n4) {
               if (n1 > n5) {
                  System.out.printf("%d é o maior.\n", n1);
               }
            }
         }
      }
      // condições para o
      if (n2 > n1) {
         if (n2 > n3) {
            if (n2 > n4) {
               if (n2 > n5) {
                  System.out.printf("%d é o maior.\n", n2);
               } // end if
            }
         }
      }
      // condições para o
      if (n3 > n1) {
         if (n3 > n2) {
            if (n3 > n4) {
               if (n3 > n5) {
                  System.out.printf("%d é o maior.\n", n3);
               } // end if
            }
         }
      }

      // condições para o
      if (n4 > n1) {
         if (n4 > n2) {
            if (n4 > n3) {
               if (n4 > n5) {
                  System.out.printf("%d é o maior.\n", n4);
               }
            }
         }
      }

      // condições para o
      if (n5 > n1) {
         if (n5 > n2) {
            if (n5 > n3) {
               if (n5 > n4) {
                  System.out.printf("%d é o maior.\n", n5);
               }
            }
         }
      }

      // CONDIÇÃO ENOR
      // condições para o
      if (n1 < n2) {
         if (n1 < n3) {
            if (n1 < n4) {
               if (n1 < n5) {
                  System.out.printf("%d é o menor.\n", n1);
               }
            }
         }
      }
      // condições para o
      if (n2 < n1) {
         if (n2 < n3) {
            if (n2 < n4) {
               if (n2 < n5) {
                  System.out.printf("%d é o menor.\n", n2);
               } // end if
            }
         }
      }
      // condições para o
      if (n3 < n1) {
         if (n3 < n2) {
            if (n3 < n4) {
               if (n3 < n5) {
                  System.out.printf("%d é o menor.\n", n3);
               } // end if
            }
         }
      }

      // condições para o
      if (n4 < n1) {
         if (n4 < n2) {
            if (n4 < n3) {
               if (n4 < n5) {
                  System.out.printf("%d é o menor.\n", n4);
               }
            }
         }
      }

      // condições para o
      if (n5 < n1) {
         if (n5 < n2) {
            if (n5 < n3) {
               if (n5 < n4) {
                  System.out.printf("%d é o menor.\n", n5);
               }
            }
         }
      }
   } // end main
} // end class