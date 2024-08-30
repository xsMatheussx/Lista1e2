
package exercicio2;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite uma palavra
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Remove espaços em branco e converte para minúsculas para evitar interferências
        String palavraFormatada = palavra.replaceAll("\\s+", "").toLowerCase();

        // Inverte a palavra formatada
        String palavraInvertida = new StringBuilder(palavraFormatada).reverse().toString();

        // Verifica se a palavra é um palíndromo
        if (palavraFormatada.equals(palavraInvertida)) {
            System.out.println("A palavra '" + palavra + "' é um palíndromo.");
        } else {
            System.out.println("A palavra '" + palavra + "' não é um palíndromo.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
