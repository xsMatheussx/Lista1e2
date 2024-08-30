/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String fraseModificada = frase.replace('a', '*');

        System.out.println("Frase modificada: " + fraseModificada);

        scanner.close();
    }
}
