package exercicio5;

import java.util.Scanner;

public class exer5 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    String nome;
    int num1,num2,num3,resul;


    System.out.println("Digite o nome do aluno: ");
    nome = ler.next();

    System.out.println("Digite a primeira nota: ");
    num1 = ler.nextInt();

    System.out.println("Digite a segunda nota: ");
    num3 = ler.nextInt();

    System.out.println("Digite a terceira nota: ");
    num2 = ler.nextInt();

    resul = (num1 + num2 + num3)/ 3;

    System.out.println("O aluno foi com media: " + resul);
 

  }  
}
