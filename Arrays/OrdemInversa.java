package br.com.dio.exercicios.arrays;


import java.util.Scanner;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Ordem Inversa: Faça um Programa que leia um vetor
        // de 5 números inteiros e mostre-os na ordem inversa.

        int[] vetor = {0,-5,15,50,8,4};

        //System.out.println(vetor.length);
        System.out.println("Vetor: ");
        int count = 0;
        while(count <= vetor.length-1){
            System.out.print(vetor[count]+" ");
            count++;
        }

        //O for precisamente serve para percorrer o array, ou seja, o for a baixo,
        //vai percorrer o array de trás pra frente a começar da posição vetor.length-1 que é a posição 5.
        //e vai ficar testando, percorrendo até que o i seja igual a 0.
        for( int i = vetor.length-1; i == 0; i--){
            System.out.println(vetor[i]+" ");
        }

    }
}
