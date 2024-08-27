import java.util.Scanner;

public class questao_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ele pede o numero
        System.out.print("Digite um numero: ");
        int num1 = input.nextInt();
        System.out.print("Digite um numero: ");
        int num2 = input.nextInt();
        System.out.print("Digite um numero: ");
        int num3 = input.nextInt();
        //descobrir o menor
        int menor = num1;
        if (menor > num2){
            menor = num2;
        }
        if (menor > num3) {
            menor = num3;
            System.out.print("o menor é "+ menor);
        }
    }
}

