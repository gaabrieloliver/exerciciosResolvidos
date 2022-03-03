// Faça um programa que leia 5 números e informe o
// maior número e a média desses números.

import java.util.Scanner;
public class MaiorMedia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;

        int cont = 0;
        int maior = 0;

        do {
        System.out.print("Numero: ");
        num = in.nextInt();
        if(num > maior)
            maior = num;
        cont++;

        }
        while(cont < 5);
        System.out.println("Maior é: "+maior);

    }
}
