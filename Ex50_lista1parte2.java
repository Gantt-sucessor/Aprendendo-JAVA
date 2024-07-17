import java.util.Scanner;

public class Ex50_lista1parte2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double x1, x2, y1, y2, formula, raiz;

        System.out.println("Informe a primeira coordenada x1: ");
        x1 = input.nextFloat();
        System.out.println("Informe a segunda coordenada x2: ");
        x2 = input.nextFloat();
        System.out.println("Informe a primeira coordenada y1: ");
        y1 = input.nextFloat();
        System.out.println("Informe a segunda coordenada y2: ");
        y2 = input.nextFloat();

        formula = (x1 - x2) * (y1 - y2);
        raiz = Math.sqrt(formula);

        if (raiz >= 10){
            System.out.println("Longe da saída");
        } else{
            System.out.println("Perto");
        }

    }
}
