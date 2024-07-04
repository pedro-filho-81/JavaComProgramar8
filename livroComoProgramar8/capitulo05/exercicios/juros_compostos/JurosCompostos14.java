/*
 * 5.14 (Programa de juros compostos modificado) 
 * Modifique o aplicativo de juros compostos da Figura 5.6 
 * para repetir os passos para taxas de juros de 5%, 6%, 7%, 
 * 8%, 9% e 10%. Utilize um loop for para variar a taxa de juros.
 */
package exercicios.juros_compostos;

public class JurosCompostos14 {
    public static void main(String[] args) {

        // variáveis
        double amount = 0.0; // saldo ou depósito
        double principal = 1000.00; // valor principal
        double rate = 0.0; // taxa de juros anual

        // loop for para a variação dos juros anuais de 5 a 10%
        for(rate = 5; rate <= 10; rate++) {

            // cabeçalho
            System.out.printf("Juros de %.2f%%aa%n", rate / 100);        
            System.out.printf("%s%20s%n", "Year", "Amont or Deposit");
        
            // loop for para calcular os juros compostos durante 10 anos
            for(int year = 1; year <= 10; year++) {
                amount = principal * Math.pow(1.0 + (rate / 100), year);
                System.out.printf("%4d%,20.2f%n", year, amount);
            } // end for

            System.out.println(); // pula linha

        } // for juros anuaus

    } // end main
} // end class
