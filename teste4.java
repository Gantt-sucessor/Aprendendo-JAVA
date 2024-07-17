import java.util.Scanner;

public class teste4 {
    public static void main(String[] args){
      Scanner input =  new Scanner(System.in);
      int n1;
      int n2;
      
      System.out.printf("Informe o primeiro número da soma: ");
      n1 = input.nextInt();
      System.out.printf("Informe o segundo número:");
      n2 = input.nextInt();
      System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
      

    }
}
