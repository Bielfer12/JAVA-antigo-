package Exercicio2;

import java.util.Scanner;

public class Gasolina {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Double  km,gasolina,resul;

    System.out.println("Digite o Km percorrido: ");
    km = ler.nextDouble();

    System.out.println("Gasolina gasta: ");
    gasolina = ler.nextDouble();

    resul = km / gasolina;

    System.out.println("A gasolina media deu: " + resul);
    }
    
}
