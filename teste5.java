import java.util.Scanner;

public class teste5 {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int numero1;
      int numero2;

      System.out.printf("Informe o primeiro número: ");
      numero1 = input.nextInt();
      System.out.printf("Informe o segundo número: ");
      numero2 = input.nextInt();
      System.out.printf(" A subtraçao do primeiro pelo segundo fica: %d - %d = %d\n", numero1, numero2, numero1 - numero2);

    }
}
