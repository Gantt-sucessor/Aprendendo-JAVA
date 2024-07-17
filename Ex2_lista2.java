import java.util.Scanner;

public class Ex2_lista2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Informe um número: ");
        n = input.nextInt();

        if (n > 10){
            System.out.println("É maior que 10!!");
        }else{
            System.out.println("É menor que 10!!");
        }
    }
}
