package baralho_de_cartas;
/*
 * Embaralhando e distribuindo cartas
 */
public class DeckOfCardsTest {
    public static void main(String[] args) {
        
        // cria o objeto de DeckOfCards
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // coloca Cards em ordem aleatória

        // imprime todas as 52 cartas na ordem em que elas foram distribuidas
        for(int i = 1; i <= 52; i++) {

            // distribui e exibe uma carta
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            // se indice multiplo de 4
            if (i % 4 == 0) {
                System.out.println(); // pule uma linha                
            } // end if
        } // end for
    } // end main
} // end class
