/*
 * 4.27 (Problema do else oscilante) Determine a saída para cada 
 * um dos conjuntos dados de código quando x é 9 e y é 11 e quando 
 * x é 11 e y é 9. O compilador ignora o recuo em um programa 
 * Java. Da mesma forma, o compilador Java sempre associa um else 
 * com o if imediatamente precedente a menos que instruído a 
 * fazer de outro modo pela colocação de chaves ({}). À primeira 
 * vista, o programador pode não ter certeza de qual if um else 
 * particular corresponde — essa situação é conhecida como 
 * "problema do else oscilante". Eliminamos o recuo do seguinte 
 * código para tornar o problema mais desafiador. [Dica: aplique 
 * as convenções de recuo que você aprendeu.]
 */
package exercicios.elseoscilante;

public class ElseOscilante27 {
   public static void main(String[] args) {
      /*
       * a)
       * if (x < 10)
       * if (y > 10)
       * System.out.println("*****");
       * else
       * System.out.println("#####");
       * System.out.println("$$$$$");
       */
      int x = 9;
      int y = 11;
      System.out.println("\nx = 9, y = 11");
      if (x < 10)
         if (y > 10)
            System.out.println("*****");
         else
            System.out.println("#####");
      System.out.println("$$$$$");

      System.out.println("\nx = 11, y = 9");
      x = 11;
      y = 9;
      if (x < 10)
         if (y > 10)
            System.out.println("*****");
         else
            System.out.println("#####");
      System.out.println("$$$$$");
   } // end main
} // end class
