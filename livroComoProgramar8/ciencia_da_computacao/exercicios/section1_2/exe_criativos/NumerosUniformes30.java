/*
 * 1.2.30 Números aleatórios uniformes. Escreva um programa que
 * imprima cinco números aleatórios uniformes entre 0 e 1, seu
 * valor médio e seus valores mínimo e máximo. Use Math.random(),
 * Math.min() e Math.max().
 * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação: Uma
 * Abordagem Interdisciplinar (p. 48).
 * Educação Pearson. Edição do Kindle.
 */
public class NumerosUniformes30 {

   public static void main(String[] args) {

      // variáveis
      double n1 = Math.random();
      double n2 = Math.random();
      double n3 = Math.random();
      double n4 = Math.random();
      double n5 = Math.random();

      System.out.println("\nNúmeros Uniformes.");
      // exibe números
      System.out.println("n1 = " + n1);
      System.out.println("n2 = " + n2);
      System.out.println("n3 = " + n3);
      System.out.println("n4 = " + n4);
      System.out.println("n5 = " + n5);

      // maior menor e média
      double maior = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5))));
      double menor = Math.min(n1, Math.min(n2, Math.min(n3, Math.min(n4, n5))));
      double media = (n1 + n2 + n3 + n4 + n5) / 5;

      // exibe resultado
      System.out.println("maior valor: " + maior);
      System.out.println("menor valor: " + menor);
      System.out.println("média = " + media + "\n");
   } // end main
} // end class