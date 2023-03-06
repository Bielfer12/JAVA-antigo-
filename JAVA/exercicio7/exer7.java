package exercicio7;

import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
        int C,F;
    
        System.out.println("Digite o nome do aluno: ");
        C = ler.nextInt();
    
        F = (9*C+160)/5;
        
        System.out.println("Graus em Farenheit" + F);

    }
}
