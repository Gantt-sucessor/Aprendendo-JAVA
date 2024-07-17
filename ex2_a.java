import java.util.Scanner;

public class ex2_a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int n3;

        System.out.printf("Informe o primeiro inteiro: ");
        n1 = input.nextInt();
        System.out.printf("Informe o segundo número inteiro: ");
        n2 = input.nextInt();
        System.out.printf("Informe o terceiro número inteiro: ");
        n3 = input.nextInt();
        System.out.printf("A multiplicação dos três números informados é de: %d * %d * %d = %d", n1, n2, n3, n1*n2*n3);

        


    }

}
    

