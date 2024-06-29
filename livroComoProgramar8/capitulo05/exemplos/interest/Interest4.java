/*
 * Calcula juros compostos com for
 */
package exemplos.interest;

public class Interest4 {
    public static void main(String[] args) {

        // variáveis
        double amount = 0.0; // saldo ou depósito
        double principal = 1000.00; // valor principal
        double rate = 0.05; // taxa de juros anual

        System.out.printf("%s%20s%n", "Year", "Amont or Deposit");
        
        // loop for para calcular os juros compostos durante 10 anos
        for(int year = 1; year <= 10; year++) {
            amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        } // end for

    } // end main
} // end class
