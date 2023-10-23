import java.util.InputMismatchException;
import java.util.Scanner;

public class george7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean viga = true;

        do {
            try {
                //arvutab kokku ja väljastab arvud
                System.out.print("esimene arv ");
                double arv1 = scanner.nextDouble();
                System.out.print("teine arv ");
                double arv2 = scanner.nextDouble();
                double tulemus = arv1 + arv2;
                System.out.println("Tulemus: " + tulemus); 

                // kui kirjutad numbri asemel tähe siis utleb "viga"
                viga = false;
            } catch (InputMismatchException e) {
                System.out.println("sisesta number palun"); 
                
            }
        } while (viga);

        scanner.close();
    }
}











