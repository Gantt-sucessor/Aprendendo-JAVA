import java.util.Scanner;

public class Ex33_lista1parte2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double hipotenusa,soma;
        int a,b; 

        System.out.println("Informe o valor de a: ");
        a = input.nextInt();

        System.out.println("Informe o valor de b:");
        b = input.nextInt();

        soma = ((a * a) + (b * b));

        hipotenusa = Math.sqrt(soma);

        System.out.printf("Hipotenusa é igual a: %.2f",hipotenusa);
        
    }
}

