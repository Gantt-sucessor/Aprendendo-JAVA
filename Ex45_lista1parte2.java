import java.util.Scanner;

public class Ex45_lista1parte2 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        float qntcamiseta_pequena, qntcamiseta_media, qntcamiseta_grande, valortotal;

        System.out.println("Informe a quantidade de camiseta pequena que foi vendida: ");
        qntcamiseta_pequena = input.nextFloat();
        System.out.println("Informe a quantidade de camiseta média que foi vendida: ");
        qntcamiseta_media = input.nextFloat();
        System.out.println("Informe a quantidade de camiseta grande que foi vendida: ");
        qntcamiseta_grande = input.nextFloat();
        
        valortotal = ((qntcamiseta_pequena * 35) + (qntcamiseta_media * 45) + (qntcamiseta_grande * 55));

        System.out.printf("O valor arrecadado de todas as vendas foi de: %.2f",valortotal);

    }
}
