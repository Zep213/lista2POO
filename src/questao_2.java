import java.util.Scanner;

public class questao_2 {
    public static void main(String[] args){
        //ele pede o numero
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num1 = input.nextInt();
        if (num1 < 0){
            System.out.print("negativo");
        }else {
            System.out.print("positivo");
        }
    }
}
