import java.util.Scanner;

public class questao_7 {
    public static void main(String[] args){
        //pede o salario bruto
        Scanner input = new Scanner(System.in);
        System.out.print("qual seu salario? ");
        double salarioBruto = input.nextDouble();
        double valorDoAumento = 0;
        double salarioReajuste = 0;
        String  porcentagemAplicada;

        if (salarioBruto <= 280.0){
            valorDoAumento = salarioBruto * 0.20;
            porcentagemAplicada = "20%";
            salarioReajuste = valorDoAumento + salarioBruto;
            System.out.println(salarioBruto);
            System.out.println(porcentagemAplicada);
            System.out.println(valorDoAumento);
            System.out.println(salarioReajuste);
        } else if (salarioBruto > 280.0 || salarioBruto <= 700.00){
            valorDoAumento = salarioBruto * 0.15;
            porcentagemAplicada = "15%";
            salarioReajuste = valorDoAumento + salarioBruto;
            System.out.println(salarioBruto);
            System.out.println(porcentagemAplicada);
            System.out.println(valorDoAumento);
            System.out.println(salarioReajuste);
        }else if (salarioBruto > 700.0 || salarioBruto <= 1500.0){
            valorDoAumento = salarioBruto * 0.10;
            porcentagemAplicada = "10%";
            salarioReajuste = valorDoAumento + salarioBruto;
            System.out.println(salarioBruto);
            System.out.println(porcentagemAplicada);
            System.out.println(valorDoAumento);
            System.out.println(salarioReajuste);
        }else if (salarioBruto > 1500.0){
            valorDoAumento = salarioBruto * 0.05;
            porcentagemAplicada = "5%";
            salarioReajuste = valorDoAumento + salarioBruto;
            System.out.println(salarioBruto);
            System.out.println(porcentagemAplicada);
            System.out.println(valorDoAumento);
            System.out.println(salarioReajuste);

        }

    }

}
