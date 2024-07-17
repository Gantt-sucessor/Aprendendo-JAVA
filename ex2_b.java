import java.util.Scanner;

public class ex2_b {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float n1;
        float n2;
        float n3;

        System.out.printf("Informe o primeiro número inteiro: ");
        n1 = input.nextFloat();
        System.out.printf("Informe o segundo número inteiro: ");
        n2 = input.nextFloat();
        System.out.printf("Informe o terceiro número inteiro: ");
        n3 = input.nextFloat();
        System.out.printf("A multiplicação do primeiro com o segundo fica em seguida divido pelo terceiro fica: %.2f * %.2f / %.2f = %.2f ", n1, n2, n3, n1 * n2 / n3);



    }
    
}
