import java.util.Scanner;

public class questao_1 {
    public static void main (String[] agrs){
        //ele pede o numero
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num1 = input.nextInt();
        System.out.print("Digite um numero: ");
        int num2 = input.nextInt();
        //descobrir o maior
        if(num1 > num2){
            System.out.print(num1);
        }else {
            System.out.print(num2);
        }
    }
}
