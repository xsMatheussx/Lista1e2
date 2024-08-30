/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine();

        nomeCompleto = nomeCompleto.trim();

        String[] palavras = nomeCompleto.split("\\s+");

        StringBuilder nomeFormatado = new StringBuilder();

        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {

                String palavraCapitalizada = palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase();

                nomeFormatado.append(palavraCapitalizada).append(" ");
            }
        }

        // Remove o espaço extra no final
        String resultado = nomeFormatado.toString().trim();

        System.out.println("Nome completo formatado: " + resultado);

        // Fecha o scanner
        scanner.close();
    }
}
