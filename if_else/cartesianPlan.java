/*PLANO CARTESIANO COM IF/ELSE */

package projectJava;

import java.util.Scanner;
public class quadranteXeY {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/*PROGRAMA IRÁ RECEBER OS 
		VALORES DAS COORDENADAS EM INTEIROS*/
		System.out.println("CoordinateX: ");
		double CordX = in.nextInt();
		System.out.println("CoordinateY: ");
		double CordY = in.nextInt();
		
		
		/*ESTRUTURA DE SELECAO IF/ELSE 
		PARA IDENTIFICAR A POSIÇÃO DOS VALORES*/
		if (CordX > 0 && CordY > 0)
			System.out.print(">>First Quadrant<<");
		else if(CordX < 0 && CordY >0)
			System.out.print(">>Second Quadrant<<");
		else if(CordX < 0 && CordY <0)
			System.out.print(">>Third Quadrant<<");
		else if(CordX > 0 && CordY <0)
			System.out.print(">>Fourth Quadrant<< ");
		else if(CordX == 0 && CordY != 0)
			System.out.println(">>Axle Y<<");
		else if(CordX != 0 && CordY == 0)
			System.out.println(">>Axle X<<");
		else if(CordX == 0 && CordY == 0)
			System.out.println(">>Origin<<");
		
		/*USADO PARA FECHAR O FLUXO E LIBERAR MEMÓRIA*/
		in.close();
		

	}

}
