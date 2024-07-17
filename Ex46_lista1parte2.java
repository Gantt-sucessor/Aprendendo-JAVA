import java.util.Scanner;

public class Ex46_lista1parte2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double qntsanduiches, qntcarnekg ,qntcarne , qntpresuntokg ,qntpresunto , qntqueijokg ,qntqueijo, queijo = 50, presunto = 50, carne = 100;

        System.out.println("Informe a quantidade de sanduiches que sera feito: ");
        qntsanduiches = input.nextDouble();
      
       qntqueijo = 100 * qntsanduiches;
       qntpresunto = 50 * qntsanduiches;
       qntcarne = 100 * qntsanduiches;
       
       qntqueijokg = qntqueijo / 1000;
       qntpresuntokg = qntpresunto / 1000;
       qntcarnekg = qntcarne / 1000;

       System.out.println("A quantidade em kg de queijo que você vai precisar é de: "+qntqueijokg+" kgs");
       System.out.println("A quantidade em kg de presunto que você vai precisar é de: "+qntpresuntokg+" kgs");
       System.out.println("A quantidade em kg de carne que você vai precisar é de: "+qntcarnekg+" kgs");
    }
}
