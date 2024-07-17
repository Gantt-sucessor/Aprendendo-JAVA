
import java.util.Scanner;

public class Ex3_lista2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float n1, n2;

        System.out.println("Informe o primeiro número: ");
        n1 = input.nextFloat();
        System.out.println("Informe o segundo número: ");
        n2 = input.nextFloat();

        if (n1 > n2){
            System.out.println("O primeiro número é maior que o segundo número!!");
        }else{
            System.out.println("O segundo número é maior que o primeiro!!");
        }
    }
}
