import java.util.Scanner;

public class Ex37_lista1parte2 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double valortotal = 780000, ganhador1, ganhador2, ganhador3;

        ganhador1 = (780000 * 0.46);

        System.out.printf("O ganhador 1 ganhou: %.2f\n",ganhador1);

        ganhador2 = (780000 * 0.32);

        System.out.printf("O ganhador 2 ganhaou %.2f\n",ganhador2);

        ganhador3 = 780000 - (ganhador1 + ganhador2);

        System.out.printf("O ganhador 3 ganhou: %.2f\n",ganhador3);
    }
}
