/*
 * Operadores lógicos
 */
package exemplos.operadores_logicos;

public class LogicalOperators {
    public static void main(String[] args) {
        
        // cria a tabela verdade para o operador (AND == && == E) CONDICIONAL
        System.out.printf("%n%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
        "Condicional AND (&&)", "false && false", (false && false),
        "false && true", (false && true),
        "true && false", (true && false),
        "true && true", (true && true));

        // cria tabela verdade para o operador (OR == || == OU) CONDICIONAL
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
        "Condicional OR (||)", "false || false", (false || false),
        "false || true", (false || true),
        "true || false", (true || false),
        "true || true", (true || true));

        // cria a tabela verdade para o operador lógico AND (&) E LÓGICO BOOLEANO
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
        "Condicional AND (&) LÓGICO BOOLEANO", "false & false", (false & false),
        "false & true", (false & true),
        "true & false", (true & false),
        "true & true", (true & true));

        // cria a tabela verdade para o operador lógico OR (|) OU LÓGICO BOOLEANO
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
        "Condicional OR (|) OU LÓGICO BOOLEANO", 
        "false | false", (false | false),
        "false | true", (false | true),
        "true | false", (true | false),
        "true | true", (true | true));

        // cria a tabela verdade para o operador lógico OU EXCLUSIVO (^) OU EXCLUSIVO LÓGICO BOOLEANO
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
        "Condicional OR EXCLUSIVO (^) OU EXCLUSIVO LÓGICO BOOLEANO", 
        "false ^ false", (false ^ false),
        "false ^ true", (false ^ true),
        "true ^ false", (true ^ false),
        "true ^ true", (true ^ true));

        // cria a tabela verdade para o operador lógico NOT (!) NÃO
        System.out.printf("%s%n%s: %b%n%s: %b%n%n",
        "Condicional NOT (!) NÃO", 
        "! false", (! false),
        "! true", (! true));

    } // end main
} // end class
