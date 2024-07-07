/*
 * 5.17 (Calculando vendas) Um varejista on-line vende cinco produtos 
 * cujos preços no varejo são como a seguir: 
 * produto 1, US$ 2,98; 
 * produto 2, US$ 4,50; 
 * produto 3, US$ 9,98; 
 * produto 4, US$ 4,49 e 
 * produto 5, US$ 6,87. 
 * Escreva um aplicativo que leia uma série de pares de números como segue:
 * a) número de produto
 * b) quantidade vendida
 * Seu programa deve utilizar uma instrução switch para determinar o preço de 
 * varejo de cada produto. Você deve calcular e exibir o valor de varejo total 
 * de todos os produtos vendidos. Utilize um loop controlado por sentinela para 
 * determinar quando o programa deve parar o loop e exibir os resultados finais.
 */
package exercicios.calculando_vendas;
/**
 * @author Pedro
 * 06/07/2024
 */
import java.util.Scanner;

public class CalculandoVendas17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
        * produto 1, US$ 2,98; 
        * produto 2, US$ 4,50; 
        * produto 3, US$ 9,98; 
        * produto 4, US$ 4,49 e 
        * produto 5, US$ 6,87. 
        */

        // constante valor dos produtos
        final double PROD1 = 2.98;
        final double PROD2 = 4.50;
        final double PROD3 = 9.98;
        final double PROD4 = 4.49;
        final double PROD5 = 6.87;

        // variáveis
        int produto = 0;
        double produto1 = 0.0;
        double produto2 = 0.0;
        double produto3 = 0.0;
        double produto4 = 0.0;
        double produto5 = 0.0;

        int quantidade = 0;
        int numVendedor = 0;
        double vlVendido = 0.0;

        // entrada de dados
        System.out.print("\nInforme o número do vendedor (-1 ´para sair): ");
        numVendedor = input.nextInt();

        do { // faça
            if (numVendedor != -1) {
                
                // entrada de dados
                System.out.print("Informe o número do produto: ");
                produto = input.nextInt();
                System.out.print("Informe a quantidade vendida (-1 para sair): ");
                quantidade = input.nextInt();

                if (produto > 0 && quantidade > 0) {
                    
                    switch (produto) {
                        
                        case 1: // caso pruduto igual a 1
                            // calcular o valordos produtos vendidos
                            produto1 = PROD1 * quantidade;
                            break; // sair

                        case 2: // caso o produto = 2
                            // calcylar o valor das vendas do produto 2
                            produto2 = PROD2 * quantidade;
                            break;  // sair do switch

                        case 3:
                            produto3 = PROD3 * quantidade;
                            break;

                        case 4:
                            produto4 = PROD4 * quantidade;
                            break;

                        case 5:
                        produto5 = PROD5 * quantidade;
                        break;

                        default:
                            System.out.println("Valor indevido!");
                            break;
                    } // end switch
                } else {
                    System.out.println("Porduto e quantidade tem que ser maior que 0 zero.");
                } // end else if interno
            } else {
                break; // saia 
            } // end else externo
            // enquanto quantidade diferente de -1
        } while(quantidade != -1); // 

        // calcular
        vlVendido = produto1 + produto2 + produto3 + produto4 + produto5;

        // exibe resultado
        System.out.printf("\nO vendedor %d vendeu R$ %.2f%n", numVendedor, vlVendido);
        
    } // end main
} // end class
