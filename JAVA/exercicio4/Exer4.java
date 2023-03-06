package exercicio4;

import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;
        double salario,venda,resul,adicao;

        System.out.println("Digite o nome do vendedor: ");
        nome = ler.nextLine();

    System.out.println("Digite o salario do vendedor: ");
    salario = ler.nextDouble();

    System.out.println("Digite as vendas do vendedor: ");
    venda = ler.nextDouble();

    resul = salario +(venda / 0.15);

    System.out.println("O vendedor " + nome + " ganhou com o salario mais vendas(15%): " + resul);
    }
    
}
