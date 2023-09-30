package functionalinterface;

import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2, 3, 4, 5, 6, 7, 8, 9);

/*
        Function<Integer,Integer> dobrar = numero -> numero * 2;
*/

        List<Integer> numerosDobrados = numeros.stream()
                .map(numero -> numero * 2)
                .toList();

        numerosDobrados.forEach(System.out::println);
    }

}
