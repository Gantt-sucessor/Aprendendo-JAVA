import java.util.Scanner;

public class Ex34_lista1parte2 {
    
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        double altura, raio, pi = 3.141592, volume;

        System.out.println("Informe a altura de um cilindro circular: ");
        altura = input.nextDouble();

        System.out.println("Informe o raio de um cilindro circular");
        raio = input.nextDouble();

        volume = pi * (raio * raio) * altura;

        System.out.printf("O volume do cilindro é de: %.2f",volume);
    }
}
