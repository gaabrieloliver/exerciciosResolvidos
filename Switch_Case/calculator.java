/*O scanner não lê char. 
O ideal é ler uma String e 
pegar o primeiro char assim:
var = in.next() .charAt(0)
*/
package javaproject;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        System.out.print("Type it a: ");
        int a = in.nextInt();
        System.out.print("Type it the operator: ");
        
        /*O SCANNER NAO LÊ CHAR, O QUE EU FAÇO AQUI É
        INFORMAR QUE O PROXIMO DADO A SER INFORMADO
        PELO USUARIO VAI SER DO TIPO INTEIRO 
        E QUE O PROGRAMA DEVE PEGAR A PRIMEIRA POSICAO
        DO NUMERO QUE O USUARIO VAI DIGITAR, POSICAO ZERO.
        COMO É APENAS 1 DIGITO, ENTAO, O charAt(0), VAI PEGAR
        O PRÓPRIO NÚMERO DIGITADO*/
        
        char op = in.next().charAt(0);
        System.out.print("Type it b: ");
        int b = in.nextInt();
        
        switch (op){
            case '+':
                int addi = a + b;
                System.out.println(addition);
                break;
            case '-':
                int sub = a - b;
                System.out.println(subtraction);
                break;
            case '/':
                int div = a / b;
                System.out.println(division);
                break;
            case 'x':
                int mult = a*b;
                System.out.println(multiplication);
                break; 
           
        }
        
        
                
    }
    
    
}
