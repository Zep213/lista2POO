import java.util.Scanner;

public class questao_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("em qual horario voce estuda? Digite 'M' para manha 'T' para tarde e 'N' para noite");
        String horario = input.next();
        horario = horario.toLowerCase();
        if (horario.equals("m")){
            System.out.print("Bom dia!!");
        }
        if (horario.equals("t")){
            System.out.print("Boa tarde!!");
        }
        if (horario.equals("n")){
            System.out.print("Boa noite!!");
        }
    }
}
