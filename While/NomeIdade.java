//Nome e Idade: Faça um programa que leia conjuntos de dois valores, 
//o primeiro representando o nome do aluno e o segundo representando a sua idade. 
//(Pare o programa inserindo o valor 0 no campo nome)

import java.util.Scanner;
public class Ex1_NomeIdade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name;
        int age;
        while(true){         System.out.println("Name: ");
            name = in.next();
            if(name.equals("0")) break;
            System.out.println("Age: ");
            age = in.nextInt();
        }
        System.out.println("Digite novamente");


    }

}
