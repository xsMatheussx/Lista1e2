package exercicio2;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        System.out.println("Palavra invertida: " + palavraInvertida);

        scanner.close();
    }
}
