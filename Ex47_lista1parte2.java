import java.util.Scanner;

public class Ex47_lista1parte2 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int htrabalhadas, hextra;
        double salariobruto, salarioliquido;

        System.out.println("Informe o número de horas trabalhadas: ");
        htrabalhadas = input.nextInt();
        System.out.println("Informe o número de horas extras trabalhadas: ");
        hextra = input.nextInt();
        
        salariobruto = (htrabalhadas * 32.50) + (hextra * 44.50);
        salarioliquido = salariobruto - (salariobruto * 0.11);

        System.out.printf("Seu salário bruto foi de: %.2f\n",salariobruto);
        System.out.printf("Seu salário líquido  descontado do INSS foi de: %.2f\n",salarioliquido);
    }
}
