/*
 * Classe Card representa uma carta do baralho
 */
package baralho_de_cartas;

public class Card {
    
    // cria variáveis de instância da classe
    private final String face; // face das cartas
    private final String suit; // naipe das cartas

    // Construtor de dois argumentos inicializa face e naipe da carta
    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    } // end construtor

    // retorna representação String do Card
    public String toString() {
        return face + " to " + suit;
    } // end tostring

} // end class Card
