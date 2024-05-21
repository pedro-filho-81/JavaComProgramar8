package capitulo03.exercicios.invoice;

/*
 * 3.12 (Classe Invoice) Crie uma classe chamada 
 * Invoice para que uma loja de suprimentos de 
 * informática a utilize para representar uma 
 * fatura de um item vendido nela. Uma Invoice 
 * (fatura) deve incluir quatro partes das 
 * informações como variáveis de instância — o 
 *  número (tipo String), a descrição (tipo String), 
 * a quantidade comprada de um item (tipo int) e o 
 * preço por item (double). Sua 
 * classe deve ter um construtor que inicializa as 
 * quatro variáveis de instância. Forneça um método 
 * set e um get para cada variável de instância. 
 * Além disso, forneça um método chamado 
 * getInvoiceAmount que calcula o valor de fatura 
 * (isto é, multiplica a quantidade pelo 
 * preço por item) e depois retorna esse valor como 
 * double. Se a quantidade não for positiva, ela deve 
 * ser configurada como 0. Se o preço 
 * por item não for positivo, ele deve ser 
 * configurado como 0.0. Escreva um aplicativo de 
 * teste chamado InvoiceTest que demonstra as 
 * capacidades da classe Invoice.
 */
import java.util.Scanner;

public class InvoiceTest {
   public static void main(String[] args) {

      // cria o objeto Scanner input
      Scanner input = new Scanner(System.in);

      // cria o objeto myFatura1 da ClasseInvoice
      ClasseInvoice myFatura1 = new ClasseInvoice("1111", "Compras diversas", 5, 12.25);

      // exibe status
      myFatura1.status();

      // entrada das faturas pelo usuário
      System.out.println("Nova fatura:");
      System.out.print("Número da fatura: ");
      myFatura1.setFatura(input.nextLine());
      System.out.print("Descrição: ");
      myFatura1.setDescricao(input.nextLine());
      System.out.print("Quantidade: ");
      myFatura1.setQuantia(input.nextInt());
      System.out.print("Preço R$: ");
      myFatura1.setPreco(input.nextDouble());

      // exibe fatura informada pelo usuário
      myFatura1.status(); // exibe a fatura
   } // end main
} // end class
