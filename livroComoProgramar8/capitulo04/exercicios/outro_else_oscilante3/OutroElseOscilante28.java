/*
 * 4.28 (Outro problema do else oscilante) Modifique o código dado para 
 * produzir a saída mostrada em cada parte do problema. Utilize 
 * técnicas de recuo adequadas. Não faça nenhuma alteração além de inserir 
 * chaves e alterar o recuo do código. O compilador ignora recuo 
 * em um programa Java. Eliminamos o recuo do código fornecido para tornar 
 * o problema mais desafiador. [Observação: é possível que não seja necessária 
 * nenhuma modificação para algumas das partes.]
 * if (y == 8) 
 * if (x == 5) 
 * System.out.println("@@@@@"); 
 * else 
 * System.out.println("#####"); 
 * System.out.println("$$$$$"); 
 * System.out.println("&&&&&");
 * a) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
 *      @@@@@ 
 *      $$$$$ 
 *      &&&&&
 * b) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
 *      @@@@@
 * c) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
 *      @@@@@
 * d) Supondo que x = 5 e y = 7, a seguinte saída é produzida. 
 * [Observação: todas as três últimas instruções de saída depois 
 * do else são partes de um bloco].
 *      ##### 
 *      $$$$$ 
 *      &&&&&
 */
package exercicios.outro_else_oscilante3;

public class OutroElseOscilante28 {
    public static void main(String[] args) {

        // variable
        int x = 5, y = 8;

        /*
         * a) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
         * 
         * @@@@@
         * $$$$$
         * &&&&&
         */
        System.out.println("A) x = 5, y = 8;");
        if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
            else
                System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");

        /*
         * b) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
         * 
         * @@@@@
         */
        System.out.println("B) x = 5, y = 8;");
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            } // end else
        } // end if externo

        /*
         * c) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
        *      @@@@@
         */
        System.out.println("B) x = 5, y = 8;");
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            } // end else
        } // end if externo
        
        /*
         * d) Supondo que x = 5 e y = 7, a seguinte saída é produzida.
         * [Observação: todas as três últimas instruções de saída depois
         * do else são partes de um bloco].
         * #####
         * $$$$$
         * &&&&&
         */

        // variable
        x = 5;
        y = 7;
        System.out.println("D) x = 5, y = 7;");
        if (y == 8) {
            if (x == 5)
                System.out.println("@@@@@");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        } // end else

    } // end main
} // end class
