import java.util.Scanner;

/*Dois garotos querem dividirr a melância que compraram no mercado,
porém querem dividir de forma que esteja em par
 */
public class imparPar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Peso da melância: ");
        double w = in.nextDouble();

        /*Esse é o cálculo pra saber se o número é par, pelo resto da divisão*/

        if(w % 2 == 0)
            System.out.println("Pode ser cortada com peso par");
            else
            System.out.println("Não pode ser cortada com peso par");

        }




    }

