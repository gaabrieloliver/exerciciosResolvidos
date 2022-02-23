/*Nesse caso, um triângulo pode ser: 

- Escaleno, quando todos os lados possuem medidas 
diferentes; 
- Isósceles, quando existem dois 
lados que possuem mesma medida; ou 
- Equilátero, quando todos os lados são congruentes.*/

package javaproject;
import java.util.Scanner;
public class calculoTriangulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("LadoA: ");
        double la= in.nextDouble();
        System.out.println("LadoB: ");
        double lb= in.nextDouble();
        System.out.println("LadoC: ");
        double lc= in.nextDouble();
        
        if (la != lb && la != lc && lc != lb)
            System.out.println("Escaleno");
        else if (la == lb && la == lc)
            System.out.println("Congruentes");
        else
            System.out.println("Isósceles");
        
    }
}
