import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int soma;
        int subtracao;
        int divisao;
        int multiplicacao;
        int opcoes;

        System.out.println(" -----MENU----- ");
        System.out.println("1- Soma ");
        System.out.println("2- Subtração ");
        System.out.println("3- Divisão ");
        System.out.println("4- Multiplicação ");
        System.out.println("Escolha uma das opções para realizar o cálculo: ");
        opcoes = input.nextInt();

        while (opcoes < 1 || opcoes > 4){
            System.out.println("Opção inexistente, informe uma opção válida");
            opcoes = input.nextInt();
        }
        
        System.out.println("Informe um primero número: ");
        int n1 = input.nextInt(); 
        System.out.println("Informe um segundo número: ");
        int n2 = input.nextInt();

        switch (opcoes){
            case 1:
            soma = n1 + n2;
            System.out.printf("A soma dos dois números é: %d \n",soma);
            break;

            case 2:
            subtracao = n1 - n2;
            System.out.printf("A subtração dos dois números é de: %d \n",subtracao);
            break;

            case 3:
            divisao = n1 / n2;
            System.out.printf("A multiplicação dos dois números é: %d \n",divisao);
            break;

            case 4:
            multiplicacao = n1 * n2;
            System.out.printf("A divisão dos dois números foi de: %d \n",multiplicacao);
            break;
        } 

    }
}
    

