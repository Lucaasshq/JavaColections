package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class GenericsExempleList {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;


        // Exemplo sem generics
        List<Object> listaSemGenerics = new ArrayList<>();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(String.valueOf(10));




        //Exemplo com Generics
        List<String> listaGenerics = new ArrayList<>();

        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");




        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }

        System.out.println("=======================");


        for (Object elemento : listaSemGenerics) {
            String str = (String) elemento;
        }

        print.accept("a");

    }
}
