/*Nesse caso, um triângulo pode ser: 

- Escaleno, quando todos os lados possuem medidas 
diferentes; 
- Isósceles, quando existem dois 
lados que possuem mesma medida; ou 
- Equilátero, quando todos os lados são congruentes.*/

package javaproject;
import java.util.Scanner;
public class triangleCalculus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("SideA: ");
        double sa= in.nextDouble();
        System.out.println("SideB: ");
        double sb= in.nextDouble();
        System.out.println("SideC: ");
        double sc= in.nextDouble();
        
        /*Aqui eu defino se o triangulo é Escaleno,
        Congruente ou Isósceles.*/
        if (sa != sb && sa != sc && sc != sb)
            System.out.println("Scalene");
        else if (sa == sb && sa == sc)
            System.out.println("Congruent");
        else
            System.out.println("Isosceles");
        
        in.close();
    }
   
}
