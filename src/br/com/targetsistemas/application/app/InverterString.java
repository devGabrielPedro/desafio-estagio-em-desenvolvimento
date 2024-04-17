package br.com.targetsistemas.application.app;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringOriginal, stringInvertida;

        // Solicita ao usuário para inserir a string
        System.out.print("Digite uma string para inverter os caracteres: ");
        stringOriginal = scanner.nextLine();

        // Chama a função para inverter a string
        stringInvertida = inverterString(stringOriginal);

        // Exibe a string invertida
        System.out.println("String invertida: " + stringInvertida);

        scanner.close();
    }

    // Inverte os caracteres de uma string.
    public static String inverterString(String stringOriginal) {
        // Cria um array de caracteres para armazenar a string invertida
        char[] caracteresInvertidos = new char[stringOriginal.length()];

        // Loop para inverter os caracteres da string
        for (int i = 0; i < stringOriginal.length(); i++) {
            // Obtém o caractere na posição i da string original
            char caractere = stringOriginal.charAt(i);
            // Insere o caractere na posição correspondente na string invertida
            caracteresInvertidos[stringOriginal.length() - i - 1] = caractere;
        }

        // Cria uma nova string a partir do array de caracteres invertidos
        String stringInvertida = new String(caracteresInvertidos);

        return stringInvertida;
    }
}