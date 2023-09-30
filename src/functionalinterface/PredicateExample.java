package functionalinterface;

import java.util.Arrays;
import java.util.List;

public class PredicateExample {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Ana", "João", "Paulo", "Emília", "Carlos");

/*
        Predicate<String> maisDeCincoLetras = palavra -> palavra.length() > 5;
*/

        palavras.stream()
                .filter(palavra -> palavra.length() > 5)
                .forEach(System.out::println);

    }
}
