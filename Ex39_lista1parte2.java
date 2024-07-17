import java.util.Scanner;

public class Ex39_lista1parte2 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        float hora_trabalho, horas_trabalhadas;
        double valorfinal, valorfinalporcen, porcentagem = 0.10;

        System.out.println("Informe o valor da hora de trabalho em reais: ");
        hora_trabalho = input.nextFloat();

        System.out.println("Informe o número de horas trabalhadas no mês: ");
        horas_trabalhadas = input.nextFloat();

        valorfinal = hora_trabalho * horas_trabalhadas;
        valorfinalporcen = valorfinal + (valorfinal * porcentagem);

        System.out.printf("O valor que será pago ao funcionário é de: %.2f",valorfinalporcen);

       
    }
}
