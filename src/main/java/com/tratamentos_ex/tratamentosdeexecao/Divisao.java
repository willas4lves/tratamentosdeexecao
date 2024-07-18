package com.tratamentos_ex.tratamentosdeexecao;

import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o dividendo: ");
        double dividendo = scanner.nextDouble();
        
        System.out.print("Digite o divisor: ");
        double divisor = scanner.nextDouble();
        
        try {
            double resultado = dividir(dividendo, divisor);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
        
    }
    
    public static double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return dividendo / divisor;
    }

}
