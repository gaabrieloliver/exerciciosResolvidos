import java.util.Scanner;
public class DefinindoUmArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Criando uma variavel vai receber valor x pelo usuário.
        System.out.println("Defina o tamanho do array");
        int tamanhoArray = in.nextInt();
        
        //Criando um array chamado arrayDeNum que vai receber o valor que foi digitado pelo usuário
        //pra definir o tamanho do Array.
        String[] arrayDeNum = new String[tamanhoArray]; 
        
        //Vai mostrar na tela qual o comprimento deste Array.
        System.out.println(arrayDeNum.length);


    }
}
