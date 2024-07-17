import java.util.Scanner;

public class Ex40_lista1parte2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double salariobase, imposto, valorfinal, gratificacao;

        System.out.println("Informe o seu salário base: ");
        salariobase = input.nextDouble();

        imposto = salariobase - (salariobase * 0.07);
        System.out.printf("sasd: %.2f",imposto);

        gratificacao = salariobase + (salariobase * 0.05);
        System.out.printf("dgfd: %.2f",gratificacao);


        valorfinal = imposto + salariobase;

        System.out.printf("O seu salário final é: %.2f",valorfinal);
    }
}

    