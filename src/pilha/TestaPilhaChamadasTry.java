package pilha;

public class TestaPilhaChamadasTry {
    public static void main(String[] args) {
        System.out.println("*** Início do método main() ***");
        metodo1();
        System.out.println("*** Fim do método main() ***");
    }

    public static void metodo1() {
        System.out.println("\t*** Início do metodo1() ***");
        metodo2();
        System.out.println("\t*** Fim do metodo1() ***");
    }

    public static void metodo2() {
        System.out.println("\t\t*** Início do metodo2() ***");
        metodo3();
        System.out.println("\t\t*** Fim do metodo2() ***");
    }

    public static void metodo3() {
        System.out.println("\t\t\t*** Início do metodo3() ***");

        try {
            Double.parseDouble("10,5");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\t\t\t*** Fim do metodo3() ***");
    }
}
