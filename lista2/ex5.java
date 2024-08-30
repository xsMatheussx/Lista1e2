package exercicio2;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        frase = frase.trim();

        if (frase.isEmpty()) {
            System.out.println("A frase não contém palavras.");
        } else {

            String[] palavras = frase.split("\\s+");

            int numeroDePalavras = palavras.length;

            System.out.println("A frase contém " + numeroDePalavras + " palavras.");
        }

        scanner.close();
    }
}
