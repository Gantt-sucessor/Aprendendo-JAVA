import java.util.Scanner;

public class ex03 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;

        System.out.printf("Informe o primeiro npumero inteiro: ");
        n1 = input.nextInt();
        System.out.printf("Informe o segundo número inteiro: ");
        n2 = input.nextInt();
        System.out.printf("A subtração dos números %d - %d = %d", n1, n2, n1 - n2);


    }
    
    
}
