package caixa_de_dialogo4;

import javax.swing.JOptionPane;

public class NameDialog2 {
   public static void main(String[] args) {

      // entrada de dados
      // variável name recebe o nome informado pelo usuário
      String name = JOptionPane.showInputDialog(null, "What is your name? ");

      // variável message exiba mensagem de boas vindas
      String message = String.format("Welcome, %s, to Java Programming!", name);

      // exibe a mensagem comprimentando o usuário
      JOptionPane.showMessageDialog(null, message);
   } // end main
} // end class
