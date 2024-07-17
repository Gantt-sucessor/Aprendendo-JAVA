import java.util.Scanner;

class teste1 {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int idade;
        int ano_atual;
        int ano_nascimento;

        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();

        System.out.printf("Sua idade é " + idade + "\n");
        
    }

}