package exercicios.exe10;

public class Exe10 {
    public static void main(String[] args)
    {
        // loop for para 10 linhas
        for (int i = 1; i <= 10; i++) 
        {
            // loop for para 5 colunas
            for (int j = 1; j <= 5; j++)
                // imprime 5 aroba em 5 colunas
                System.out.print('@');
                
            // pula uma linha
            System.out.println();
        } // end for 1
    } // end main
} // end class
