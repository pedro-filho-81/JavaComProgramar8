package capitulo02.exercicios;

/*
 * 2.31 (Tabela de quadrados e cubos) Utilizando apenas as técnicas de programação 
 * que aprendeu neste capítulo, escreva um aplicativo que calcule os quadrados e 
 * cubos dos números de 0 a 10 e imprima os valores resultantes em formato de 
 * tabela como a seguir:
 */
public class TabQuadradosCubos {
   public static void main(String[] args) {
      System.out.printf("%s\t%s\t%s%n", "Number", "Square", "Cube");
      System.out.printf("%d\t%d\t%d%n", 0, 0 * 0, 0 * 0 * 0);
      System.out.printf("%d\t%d\t%d%n", 1, 1 * 1, 1 * 1 * 1);
      System.out.printf("%d\t%d\t%d%n", 2, 2 * 2, 2 * 2 * 2);
      System.out.printf("%d\t%d\t%d%n", 3, 3 * 3, 3 * 3 * 3);
      System.out.printf("%d\t%d\t%d%n", 4, 4 * 4, 4 * 4 * 4);
      System.out.printf("%d\t%d\t%d%n", 5, 5 * 5, 5 * 5 * 5);
      System.out.printf("%d\t%d\t%d%n", 6, 6 * 6, 6 * 6 * 6);
      System.out.printf("%d\t%d\t%d%n", 7, 7 * 7, 7 * 7 * 7);
      System.out.printf("%d\t%d\t%d%n", 8, 8 * 8, 8 * 8 * 8);
      System.out.printf("%d\t%d\t%d%n", 9, 9 * 9, 9 * 9 * 9);
      System.out.printf("%d\t%d\t%d%n", 10, 10 * 10, 10 * 10 * 10);
   } // end main
} // end class
