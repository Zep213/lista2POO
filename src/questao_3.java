import java.util.Scanner;

public class questao_3 {
    public static void main(String[] args){
        //pede a nota
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua nota: ");
        double num1 = input.nextInt();
        System.out.print("Digite sua nota: ");
        double num2 = input.nextInt();
        //caucula a media
        double media = (num1 + num2) / 2;
        //aprovado ou nao
        if (media == 10.0){
            System.out.print("Aprovado com distinçao");
        } else if (media >= 7.0) {
            System.out.print("Aprovado");
        }else{
            System.out.print("reprovado");
        }

    }

}
