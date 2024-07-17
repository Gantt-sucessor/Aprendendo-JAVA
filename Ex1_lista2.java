import java.util.Scanner;

public class Ex1_lista2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n1, n2;
        float n3, multiplicacao, soma, elevadoresul, elevado = 3;

        System.out.println("Informe o primeiro número inteiro: ");
        n1 = input.nextInt();
        System.out.println("Informe o segundo número inteiro: ");
        n2 = input.nextInt();
        System.out.println("Informe o número real:");
        n3 = input.nextFloat();

        multiplicacao = n1 *(n2 / 2);
        soma = (3 * n1) + n3;


        System.out.printf("A multiplicação do primeiro número com a metade do segundo número fica: %.2f\n",multiplicacao);
        System.out.printf("A soma do triplo do primeiro número com o terceiro número fica: %.2f\n",soma);
        System.out.println("O terceiro número: "+n3+" elevado ao cubo fica: "+Math.pow(n3,3));
    }
}
