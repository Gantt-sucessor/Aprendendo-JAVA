import java.util.Scanner;

public class Ex38_lista1parte2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float  valorposdias, diastrabalhados, valordia = 30;
        double valorfinal, desconto = 0.08;

        System.out.println("Informe o número de dias trabalhados: ");
        diastrabalhados = input.nextFloat();

        valorposdias =  (diastrabalhados * valordia);

        valorfinal = valorposdias - (valorposdias * desconto);
        System.out.printf("O salário líquido ficou: %.2f",valorfinal);


        

    }
}

