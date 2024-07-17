import java.util.Scanner;

public class Ex44_lista1parte2 {
    
    public static void mian(String[] args){

        Scanner input = new Scanner(System.in);

        float conversao ,precofinal, pesoprato, pesokilo = 57;

        System.out.println("Informe o peso do seu prato em gramas: ");
        pesoprato = input.nextFloat();

        conversao = pesoprato / 1000;
        precofinal = conversao * pesokilo;

        System.out.printf("O preço final ficou: ",precofinal);

    }
}
