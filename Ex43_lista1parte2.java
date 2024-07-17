import java.util.Scanner;

public class Ex43_lista1parte2 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double total, totalbroa,totalpao,qntbroa, qntpao, poupanca ,broa = 1.50, pao = 0.12;

        System.out.println("Informe a quantidade de pãos que você vendeu ao final do dia: ");
        qntpao = input.nextDouble();
        System.out.println("Informe a quantidade de de broas que você vendeu ao final do dia: ");
        qntbroa = input.nextDouble();
        
        totalpao = qntpao * pao;
        totalbroa = qntbroa * broa;
        total = totalpao + totalbroa;

        System.out.printf("O total de paos e broas vendidos ao final do dia foi de: %.2f\n",total);

        poupanca = total * 0.10;

        System.out.printf("A quantidade que você deve guardar é: %.2f",poupanca);



    }
}
