import java.util.Calendar;
import java.util.Scanner;

public class teste2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int idade;
        int ano_atual;
        int ano_nascimento;

        System.out.println("Digite sua idade:");
        idade =  entrada.nextInt();

        Calendar calendario = Calendar.getInstance();
        ano_atual = calendario.get(Calendar.YEAR);
        ano_nascimento = ano_atual - idade;
        
        System.out.printf("Você nasceu em " + ano_nascimento + "\n");

    }
}
