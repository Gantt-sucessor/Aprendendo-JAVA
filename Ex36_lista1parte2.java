import java.util.Scanner;

public class Ex36_lista1parte2 {
    
    public static void mian(String[] args){

        Scanner input = new Scanner(System.in);

        double salario, salarionovo, aumento = 0.25;

        System.out.println("Informe seu salário: ");
        salario = input.nextDouble();

        salarionovo = salario + (salario * aumento);

        System.out.printf("O salário com o aumento ficou: %.2f",salarionovo);
    }
}
