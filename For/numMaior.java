package projectJava;
import java.util.Scanner;
public class numMaior {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double maior=0;
		for (int i=1; i<=3; i++){
			double n = in.nextDouble();
			if (n > maior)
				maior = n;
		}
		System.out.println();
	}
}
