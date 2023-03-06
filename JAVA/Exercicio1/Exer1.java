package Exercicio1;

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
        double num1,num2,soma,sub,div,x;

        System.out.println("Digite o numero 1:");
        num1 = ler.nextDouble();

        System.out.println("Digite o numero 2:");
        num2 = ler.nextDouble();

        soma = num1 + num2;
        sub = num1 - num2;
        div = num1 / num2;
        x = num1 * num2;

        System.out.println("A soma deu: " + soma + " A subtração deu" + sub + " A divisão deu: " + div + " A multiplicação deu: " + x);
    }
    
}