import java.util.Scanner;

public class ex05 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;

        System.out.printf("Informe o primeiro número inteiro: ");
        n1 = input.nextInt();
        System.out.printf("Informe um segundo número inteiro: ");
        n2 = input.nextInt();
        System.out.printf("O resto da divisão dos números %d por %d = %d",n1, n2, n1 % n2);



    }
    
}
