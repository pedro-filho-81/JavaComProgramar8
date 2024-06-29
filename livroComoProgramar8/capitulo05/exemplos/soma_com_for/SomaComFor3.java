package exemplos.soma_com_for;

public class SomaComFor3 {
    public static void main(String[] args) {
        
        int total = 0;
        
        for (int count = 1; count <= 10; count++) {
            System.out.printf("%d ", count);
            total = total + count;
        } // end for

        System.out.println("\nTotal = " + total);

    } // end main
} // end class
