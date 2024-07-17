import java.util.Scanner;

public class Ex5_lista2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String letra;

        System.out.println("Informe uma letra M ou F: ");
        letra = input.next();

        if (!letra.equals("M") && !letra.equals("F")){
            System.out.println("Sexo inválido");
        }else if (letra.equals("M")){
            System.out.println("Masculino!!");
        }else if (letra.equals("F")) {
           System.out.println("Feminino!!!"); 
        }
     }
}

