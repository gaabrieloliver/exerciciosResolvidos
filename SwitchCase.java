/*O scanner não lê char. Leia uma String e pegue o primeiro char assim:
var = in.next() .charAt(0)
*/
package javaproject;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        System.out.print("Digite a: ");
        int a = in.nextInt();
        System.out.print("Digite operador: ");
        char op = in.next().charAt(0);
        System.out.print("Digite b: ");
        int b = in.nextInt();
        
        switch (op){
            case '+':
                int soma = a + b;
                System.out.println(soma);
                break;
            case '-':
                int sub = a - b;
                System.out.println(sub);
                break;
            case '/':
                int div = a / b;
                System.out.println(div);
                break;
            case 'x':
                int mult = a*b;
                System.out.println(mult);
                break; 
           
        }
        
        
                
    }
    
    
}
