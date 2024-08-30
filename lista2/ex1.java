/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        palavra = palavra.trim();

        int numeroDeLetras = palavra.length();

        System.out.println("A palavra '" + palavra + "' possui " + numeroDeLetras + " letras.");

        scanner.close();
    }
}
