import java.util.Scanner;

class ex06 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float n1;
        float n2;

        System.out.printf("Informe o primeiro número inteiro: ");
        n1 = input.nextFloat();
        System.out.printf("Informe o segundo número inteiro: ");
        n2 = input.nextFloat();
        System.out.printf("A divisão com duas casas decimais depois da vírgula ficou: %.2f / %.2f = %.2f", n1, n2, n1 / n2);
        

    }

    
}
