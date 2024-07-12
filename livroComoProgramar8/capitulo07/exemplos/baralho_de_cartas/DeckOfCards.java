/*
 * Classe DeckOfCarde representa o baralho de cartas
 */
package baralho_de_cartas;

import java.security.SecureRandom;
import java.util.Random;

public class DeckOfCards {
    
    private Card[] deck; // array deck (baralho) objeto da classe Card (cartas)
    // variável de instância
    private int currentCard; // indice da próxima Card a ser distribuída (0 - 51)
    // tamanho do array desc (baralho)
    private static final int NUmBER_OF_CARDS = 52; // Número constante de Cards (cartas)
    private static final SecureRandom randomNumbers = new SecureRandom();

    // construtor preenche o DeckOfCards (baralho de cartas)
    public DeckOfCards() {
        
        // array string faces ()
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven",
                 "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        
        // array string naipes
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // cria o array do objeto Cards
        deck = new Card[NUmBER_OF_CARDS]; 
        currentCard = 0; // a primeira carta distribuída será o deck[0];

        // preenche o baralho com objetos Cards
        for(int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        } // end for preencha baralho

    } // end construtuo

    // embaralha as cartas com um algoritimo de uma passagem
    public void shuffle() { // embaralha
        
        // a próxima chamada para para o método dealCard deve comesar no deck[0] novamente
        currentCard = 0; 

        // para cada Card selecione outro Card aleatório entre 0 e 51
        for(int first = 0; first < deck.length; first++) {

            // seleciona um número aleatório entre (0 - 51)
            int second = randomNumbers.nextInt(NUmBER_OF_CARDS);

            // compara Card atual com Card aleatorialmente selecionada
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;

        } // end for
    } // end shuffle

    // distribui uma carta
    public Card dealCard() {

        // determina se ainda há Cards a serem distribuidas
        if (currentCard < deck.length) {
            return deck[currentCard++]; // retorna o Card atual no array
        } else {
            return null; // retorna nulo para indicar que todos os cards foram foram distribuidos
        } // end else
    } // end função dealCard
    
} // end class DeckOfCards
