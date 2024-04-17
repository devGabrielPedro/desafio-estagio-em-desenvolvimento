package br.com.targetsistemas.application.app;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir o número a ser verificado
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        // Calcula a sequência de Fibonacci até o número fornecido
        System.out.println("\nSequência de Fibonacci até " + numero + ":");
        calcularFibonacci(numero);

        // Chama a função para verificar se o número fornecido pertence à sequência de Fibonacci
        boolean pertence = verificarFibonacci(numero);

        // Exibe o resultado
        if (pertence) {
            System.out.println("\n" + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("\n" + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    // Função para calcular e exibir a sequência de Fibonacci até um número
    public static void calcularFibonacci(int numero) {
        int a = 0, b = 1;
        while (a <= numero) {
            System.out.print(a + " ");
            // Atualiza os valores de a e b para os próximos números da sequência
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }

    // Função para verificar se um número pertence à sequência de Fibonacci
    public static boolean verificarFibonacci(int numero) {
        int a = 0, b = 1;
        // Loop para verificar se o número está na sequência
        while (a <= numero) {
            // Se o número atual for igual ao número fornecido, retorna true
            if (a == numero) {
                return true;
            }
            // Atualiza os valores de a e b para os próximos números da sequência
            int temp = a;
            a = b;
            b = temp + b;
        }
        // Se o número não for encontrado na sequência, retorna false
        return false;
    }
}