mport java.util.Scanner;
public class MaiorNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(">>>Maior número<<<");

        int num;
        int maior=0;
        int cont= 1;

        do{
            System.out.print("Digite um numero: ");
            num = in.nextInt();
            if(num > maior)
                maior=num;
                cont++;
        }
        while(cont<=3);
        System.out.println(maior);

    }
}
