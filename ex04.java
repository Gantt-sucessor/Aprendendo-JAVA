import java.util.Scanner;

public class ex04 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;

        System.out.printf("Informe o primeiro número inteiro: ");
        n1 = input.nextInt();
        System.out.printf("Informe o segundo número inteiro:" );
        n2 = input.nextInt();
        System.out.printf("A multiplicação dos números é: %d * %d = %d", n1, n2, n1*n2);
        



    }
}
