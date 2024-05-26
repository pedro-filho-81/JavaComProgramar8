package capitulo04.exemplos.pre_pos_increment;

/*
 * operadores de pré-increment e pós-increment
 */
public class PrePosIncrement {
   public static void main(String[] args) {

      // variable
      int c = 5;
      // demonstra o operador de pós-incremento
      System.out.println("demonstra o operador de pós-incremento");
      System.out.println("int c = 5;");
      System.out.printf("c before postincrement: %d%n", c);
      System.err.printf("   postincrementing c++: %d%n", c++);
      System.out.printf("c after postincrement: %d%n%n", c);

      c = 5;
      // operador de pré-incremento
      System.out.println("operador de pré-incremento: ");
      System.out.println("int c = 5;");
      System.out.printf("c before preincrement: %d%n", c);
      System.out.printf("     preincrementing ++c: %d%n", ++c);
      System.out.printf("c after preincrement: %d%n", c);
   } // end main
} // end class
