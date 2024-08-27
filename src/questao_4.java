import java.util.Scanner;

public class questao_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ele pede o numero
        System.out.print("Digite um numero: ");
        int num1 = input.nextInt();
        System.out.print("Digite um numero: ");
        int num2 = input.nextInt();
        System.out.print("Digite um numero: ");
        int num3 = input.nextInt();
        int maior = num1;
        //descobrir o maior
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        System.out.print(maior);
    }

}