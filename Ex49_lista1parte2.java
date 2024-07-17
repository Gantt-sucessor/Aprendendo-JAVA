import java.util.Scanner;

public class Ex49_lista1parte2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double qntlata, qntgarrafa, qntgarrafa2, qnttotallata, qnttotalgarrafa, qnttotalgarrafa2, litrolata, litrogarrafa, litrogarrafa2, somatotal;

        System.out.println("Informe a quantidade de latas de refrigerante que você comprou: ");
        qntlata = input.nextDouble();
        System.out.println("Informe a quantidade de garrafas de 600 de refrigerante que você comprou: ");
        qntgarrafa = input.nextDouble();
        System.out.println("Informe a quantidade de garrafas de 2L de refrigerante que você comprou: ");
        qntgarrafa2 = input.nextDouble();

        qnttotallata = qntlata * 350;
        qnttotalgarrafa = qntgarrafa * 600;
        qnttotalgarrafa2 = qntgarrafa2 * 2000;


        somatotal = (qnttotallata + qnttotalgarrafa + qnttotalgarrafa2) / 1000;

        System.out.printf("Você comprou essa quantidade de litros de refrigerante: %.2f",somatotal);
    }
}
