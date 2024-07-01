package exemplos.exemplos_com_for;

public class ExemplosComFor5 {
    public static void main(String[] args) {
        
        // a) Varie a variável de controle de 1 a 100 em incrementos de 1.
        System.out.println("\na) Varie a variável de controle de 1 a 100 em incrementos de 1.");
        for (int i = 1; i <= 100; i++)
            System.out.printf("%d ", i);
        
        // b) Varie a variável de controle de 100 a 1 em decrementos de 1.
        System.out.println("\nb) Varie a variável de controle de 100 a 1 em decrementos de 1.");
        for (int i = 100; i >= 1; i--)
            System.out.printf("%d ",i);
        
        // c) Varie a variável de controle de 7 a 77 em incrementos de 7.
        System.out.println("\nc) Varie a variável de controle de 7 a 77 em incrementos de 7.");
        for (int i = 7; i <= 77; i += 7)
            System.out.printf("%d ", i);
        
        // d) Varie a variável de controle de 20 a 2 em decrementos de 2.
        System.out.println("\nd) Varie a variável de controle de 20 a 2 em decrementos de 2.");
        for (int i = 20; i >= 2; i -= 2)
            System.out.printf("%d ", i);
        
        // e) Varie a variável de controle em relação aos valores 2, 5, 8, 11, 14, 17, 20.
        System.out.println("\ne) Varie a variável de controle em relação aos valores 2, 5, 8, 11, 14, 17, 20.");
        for (int i = 2; i <= 20; i += 3)
        System.out.printf("%d ", i);
       
        // f) Varie a variável de controle em relação aos valores 99, 88, 77, 66, 55, 44, 33, 22, 11, 0.
        System.out.println("\nf) Varie a variável de controle em relação aos valores 99, 88, 77, 66, 55, 44, 33, 22, 11, 0.");
        for (int i = 99; i >= 0; i -= 11)
            System.out.printf("%d ", i);
    } // end main
} // end class
