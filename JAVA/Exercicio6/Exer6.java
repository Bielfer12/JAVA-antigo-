package Exercicio6;

import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int A,B,C;

    System.out.println("Digite o nome do aluno: ");
    A = ler.nextInt();

    System.out.println("Digite a primeira nota: ");
    B = ler.nextInt();   
   
    C = A;
    A = B;
    B = C;
    
    System.out.println("TROCA: " + A+ "\n"+ B);
    
    }
}
