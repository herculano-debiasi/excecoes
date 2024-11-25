package excecoes;

import java.util.ArrayList;
import java.util.List;

public class Problemas1e2Tratados {
    public static void main(String[] args) {
        try {
            int[] arranjo = {1, 2, 3};
            System.out.println(arranjo[2]);
            System.out.println(arranjo[3]); // Gera a exceção 'ArrayIndexOutOfBoundsException'

            List<Integer> numeros = new ArrayList<>();
            numeros.add(10);
            numeros.add(20);
            numeros.add(30);
            System.out.println(numeros.get(2));
            System.out.println(numeros.get(3)); // Lança a exceção 'IndexOutOfBoundsException'
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida do array");
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posição inválida da lista");
        }

        System.out.println("Programa finalizado normalmente!");
    }
}
