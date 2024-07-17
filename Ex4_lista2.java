import java.util.Scanner;

public class Ex4_lista2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Informe o primeiro número: ");
        n1 = input.nextInt();
        System.out.println("Informe o segundo número: ");
        n2 = input.nextInt();
        System.out.println("Informe o terceiro número: ");
        n3 = input.nextInt();

        if (n1 < n2 && n1 < n3 && n2 < n3 ){
            System.out.println("Os números estão em ordem crescente!!");
        }else{
            System.out.println("Os números não estão em ordem crescente!!");
        }
    }
}
