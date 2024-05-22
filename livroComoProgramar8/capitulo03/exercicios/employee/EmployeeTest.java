package capitulo03.exercicios.employee;

import java.util.Scanner;

public class EmployeeTest {
   public static void main(String[] args) {
      // cria o objeto Scanner input
      Scanner input = new Scanner(System.in);

      // cria o objeto da class Employee
      ClasseEmployee myEmployee1 = new ClasseEmployee("Pedro", "Filho", 1650.25);
      // cria o objeto myEmployee2 da classe Employee
      ClasseEmployee myEmployee2 = new ClasseEmployee("Cleonice", "morais", 2125.25);

      // exibe
      myEmployee1.status();
      myEmployee2.status();
   } // end main
} // end class
