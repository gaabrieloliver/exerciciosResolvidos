
import java.util.Scanner;

public class votoEleitoral {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int an = in.nextInt();
        int at = 2022;
        int i = at - an;
        System.out.println(i);
        if (i < 16) {
            System.out.println("Não vota");
        } else if ((i >= 16 && i<18) || (i>70)) {
            System.out.println("Opcional");
        } else {
            System.out.println("Obrigatório");
        }

    }

}
