
import java.util.Scanner;

public class Ex35_lista1parte2 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double valorproduto, valorcomdesconto, desconto = 0.12;

        System.out.println("Informe o valor do produto: ");
        valorproduto = input.nextDouble();

        valorcomdesconto = valorproduto - (valorproduto * desconto);

        System.out.printf("O valor com desconto ficou: %.2f",valorcomdesconto);
    }
}
