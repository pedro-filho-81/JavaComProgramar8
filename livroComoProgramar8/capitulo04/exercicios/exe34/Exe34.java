/*
 * 4.34 (O que há de errado com esse código?) O que há de errado com 
 * a seguinte instrução? Forneça a instrução correta para adicionar 1 à 
 * soma de x e y. 
 * System.out.println(++(x + y));
 */
package exercicios.exe34;

public class Exe34 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        // errado
        // System.out.println(++(x + y));
        System.out.println("int x = 10, y = 20;");
        System.out.println("Incremento ou decremento não é \na maneira correta de somar 1 a expressão (++(x + y))");
        System.out.println("Correto ((x + y) + 1)) = " + ((x + y) + 1));
    } // end main
} // end class
