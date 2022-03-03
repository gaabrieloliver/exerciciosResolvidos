// Faça um programa que leia 5 números e informe o
// maior número e a média desses números.

import java.util.Scanner;
public class MaiorMedia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;

        int cont = 1;
        int maior = 0;
        int soma=0;

        do {
        System.out.print("Numero: ");
        num = in.nextInt();
        if(num > maior)
            maior = num;
        soma=soma+num;
        cont++;

        }
        while(cont <= 5);
        System.out.println("Maior é: "+maior);
        System.out.println("Média é: "+soma/5);
    }
}
