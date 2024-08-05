package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args) {

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
            System.out.println(str);
        }
    }
}
