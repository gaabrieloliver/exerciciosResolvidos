/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. 
O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:*/

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("TABUADA");

        int tab = 0;

        System.out.print("Qual a tabuada?\nDigite: ");
        tab = in.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(tab+" x "+i+" = "+tab*i);

        }

    }
}

/*Resultado
TABUADA
Qual a tabuada?
Digite: 5
5 x 0 = 0
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50*/
