import java.util.Scanner;

public class Ex48_lista1parte2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int qntfrangos;
        double chipidentificacao = 4, chipdealimento = 3.50, qnttotal;
        double qntchipidentificacao, qntchipdealimento;

        System.out.println("Informe a quantidade de frangos que sua granja tem: ");
        qntfrangos = input.nextInt();
        
        qntchipidentificacao = qntfrangos * 4;
        qntchipdealimento = (qntfrangos * 2) * 3.50;
        qnttotal = qntchipidentificacao + qntchipdealimento;    
    
        System.out.println("Serão gastos com chip de identificação: "+qntchipidentificacao+" reais e serão gastos com chip de alimento: "+qntchipdealimento+" reais");
        System.out.printf("O valor total para marcar todos os frangos vai ser de: %.2f",qnttotal);

    }
}
