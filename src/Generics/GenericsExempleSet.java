package Generics;

import java.util.HashSet;
import java.util.Set;

public class GenericsExempleSet {
    public static void main(String[] args) {

        // Exemplo sem Generics
        Set conjuntoSemGenerics = new HashSet();

        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add(String.valueOf(10));

        // Exemplo com Generics

        Set<String> conjuntoComGenerics = new HashSet<>();

        conjuntoComGenerics.add("Elemento 1");
        conjuntoComGenerics.add("Elemento 2");


        for (String elemento : conjuntoComGenerics) {
            System.out.println(elemento);
        }

        System.out.println("=============================");

        for (Object elemento : conjuntoSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }

    }
}
