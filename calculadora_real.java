import java.util.Scanner;

public class calculadora_real {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float soma;
        float subtracao;
        float divisao;
        float multiplicacao;
        int raiz_quadrada;
        float elevado_2;
        int escolha;

        System.out.println(" ------MENU------ ");
        System.out.println("1- Soma");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.println("5- Raiz quadrada");
        System.out.println("6- Elevado a 2");
        System.out.println("Escolha uma das opções para realizar a operação:");
        escolha = input.nextInt();

        while (escolha < 1 || escolha > 4){
            System.out.println("Opção inválida, informe uma opção que exista:");
            escolha = input.nextInt();
        }

        System.out.println("Informe o primeiro número para operação: ");
        float n1 = input.nextFloat();
        System.out.println("Informe o segundo número para operação: ");
        float n2 = input.nextFloat();
        
        switch (escolha){
            case 1:
            soma = n1 + n2;
            System.out.printf("A soma dos dois números foi: %.2f",soma);
            break;

            case 2:
            subtracao = n1 - n2;
            System.out.printf("A subtração dos dois números foi: %.2f",subtracao);
            break;

            case 3:
            multiplicacao = n1 * n2;
            System.out.printf("A multiplicação dos dois números foi: %.2f",multiplicacao);

            case 4:
            divisao = n1 / n2;
            System.out.printf("A divisão dos dois números foi: %.2f",divisao);

            case 5:
            raiz_quadrada = Math.sqrt(n1);


        }

     




    }
    
}
