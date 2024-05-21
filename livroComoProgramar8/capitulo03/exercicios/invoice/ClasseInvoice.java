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
public class ClasseInvoice {

   // Atributos
   // Variáveis de instância
   private String numFatura;
   private String descricao;
   private int quantiComprada;
   private double preco;

   // construtor da classe Invoice
   public ClasseInvoice(String numFatura, String descricao, int quantiComprada, double preco) {
      this.numFatura = numFatura;
      this.descricao = descricao;

      // this.quantiComprada = quantiComprada;
      setQuantia(quantiComprada); // chama o método setQuantia

      // this.preco = preco;
      // chama o método setPreço
      setPreco(preco);
   } // end construtor

   // getInvoiceAmount
   public double getInvoiceAmount() {
      return (quantiComprada * preco);
   } // end getInvoiceAmount

   // set fatura
   public void setFatura(String numFatura) {
      this.numFatura = numFatura;
   } // end setFatura

   // get fatura
   public String getFatura() {
      return numFatura;
   } // end getFatura

   // set descrição
   public void setDescricao(String descricao) {
      this.descricao = descricao;
   } // end set descrição
     // get descrição

   public String getDiscricao() {
      return descricao;
   } // get end descrição

   // set Quantia
   public void setQuantia(int quantiComprada) {
      if (quantiComprada > 0)
         this.quantiComprada = quantiComprada;
      else
         quantiComprada = 0;
   } // end set quantia
     // get qusntia

   public int getQuantia() {
      return quantiComprada;
   } // get quantis

   // set preço
   public void setPreco(double preco) {
      if (preco > 0.0)
         this.preco = preco;
      else
         preco = 0.0;
   } // end preço

   // get preço
   public double getPreco() {
      return preco;
   } // end preço

   public void status() {
      System.out.printf("\nFatura: %s%nDescrição: %s%nQuantidade: %d%nPreço R$: %.2f%n",
            this.getFatura(), // num fatura
            this.getDiscricao(),
            this.getQuantia(),
            this.getPreco());
      // exibe total da fatura
      System.out.printf("Total R$: %.2f%n%n", getInvoiceAmount());
   } // end status

} // end class
