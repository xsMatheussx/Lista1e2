
package exercicio2;

import java.util.Scanner;

public class ex7{
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite seu endereço de email: ");
        String email = scanner.nextLine();

        // Verifica se o email contém o caractere '@'
        if (email.contains("@")) {
            // Encontra o índice do caractere '@'
            int indiceArroba = email.indexOf('@');
            
            // Extrai o domínio a partir do índice do caractere '@'
            String dominio = email.substring(indiceArroba + 1);
            
            // Exibe o domínio
            System.out.println("Domínio do email: " + dominio);
        } else {
            System.out.println("O endereço de email fornecido não é válido.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
