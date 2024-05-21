package capitulo03.exercicios.employee;

import java.util.Scanner;

public class EmployeeTest {
   public static void main(String[] args) {
      // cria o objeto Scanner input
      Scanner input = new Scanner(System.in);

      // cria o objeto da class Employee
      ClasseEmployee myEmployee = new ClasseEmployee("Pedro", "Filho", 1647.00);
      System.out.println("Construindo a classe Employee.");

      // exibe
      myEmployee.status();
   } // end main
} // end class
