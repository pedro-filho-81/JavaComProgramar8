package array_list;
// Demonstração da coleção ArrayList<T> genérica.
import java.util.ArrayList;
public class ArrayListCollection {
    public static void main(String[] args) {
        
        // cria o novo ArrayList de String com capacidade inicial para 10 elementos
        ArrayList<String> items = new ArrayList<String>();

        // objeto.add adiciona elementos a lista
        items.add("red");
        items.add(0, "yellow"); // adiciona yellow na posição zero 0;

        // cabeçalho
        System.out.print("Display list contents with counter-controlled loop:\n");

        // exibe as cores na lista
        System.out.print("Itens: ");
        for(int i = 0; i < items.size(); i++) {
            System.out.printf("%s ", items.get(i));
        } // end for

        // exibe as cores usando for aprimorada no método display
        display(items, "Display list contents with enhanced for statement:");

        // adiciona itens a lista
        items.add("green");
        items.add("blue");
        display(items, "List with two new elements.");

        // REmOVE ITENS
        // remove a cor amarela
        items.remove("yellow");
        display(items, "Remove a cor yellow.");

        // remove o item do indice 1 (green)
        items.remove(1);
        display(items, "Remove o item do indice 1 (green)");

        // VERIFICA CONTEÚDO DO ARRAY
        // verifica se o array tem a cor vermelha (red)
        System.out.printf("\"red\" is in (%s) the list?%n", 
                        items.contains("red"));

        // verifica se o array tem a cor a// verifica se o array tem a cor vermelha (red)
        System.out.printf("\"red\" is in (%s) the list?%n", 
                        items.contains("red"));

        System.out.printf("\"red\" is in (%s) the list?%n", 
        items.contains("red"));


    } // end main

    // método display
    public static void display(ArrayList<String> items, String header) {

        // exibe o cabeçalho
        System.out.printf("%n%s%n", header);

        System.out.print("Itens: ");
        // loop for para exibis os elementos do array
        for(String item : items) {
            System.err.printf(" %s", item);
        } // end for

        System.out.println(); // pula linha

    } // end display
} // end class
