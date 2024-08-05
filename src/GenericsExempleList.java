import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsExempleList {
    public static void main(String[] args) {

        // Exemplo sem generics
        List<Object> listaSemGenerics = new ArrayList<>();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10);
        listaSemGenerics.add(true);



        //Exemplo com Generics
        List<String> listaGenerics = new ArrayList<>();

        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");



        for (Object elemento : listaSemGenerics) {
            System.out.println(elemento);
        }

        System.out.println("=======================");

        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }

    }
}
