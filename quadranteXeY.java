package projectJava;

import java.util.Scanner;
public class quadranteXeY {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("CoordenadaX: ");
		double CordX = in.nextInt();
		System.out.println("CoordenadaY: ");
		double CordY = in.nextInt();
		
		
		
		if (CordX > 0 && CordY > 0)
			System.out.print(">>Primeiro Quadrante<<");
		else if(CordX < 0 && CordY >0)
			System.out.print(">>Segundo Quadrante<<");
		else if(CordX < 0 && CordY <0)
			System.out.print(">>Terceiro Quadrante<<");
		else if(CordX > 0 && CordY <0)
			System.out.print(">>Quarto Quadrante<< ");
		else if(CordX == 0 && CordY != 0)
			System.out.println(">>Eixo Y<<");
		else if(CordX != 0 && CordY == 0)
			System.out.println(">>Eixo X<<");
		else if(CordX == 0 && CordY == 0)
			System.out.println(">>Origem<<");
		
		in.close();
		

	}

}
