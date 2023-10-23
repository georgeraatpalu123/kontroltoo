
import java.util.Scanner;

public class kt5{
    public static void main(String[] args) {
    Scanner sisend = new Scanner(System.in);
    System.out.print("mitu takistit soovite ühendada: ");
    int takistiteArv = sisend.nextInt();
    double kogutakistusJ = 0;
    double kogutakistusRoppselt = 0;
        
    for (int i = 1; i <= takistiteArv; i++) {
    System.out.print("sisesta" + i + ". takisti takistus ohmides: ");
    double takistus = sisend.nextDouble();
        
    kogutakistusJ += takistus;
        kogutakistusRoppselt = 1 / (1 / kogutakistusRoppselt + 1 / takistus);
    }
        
        System.out.println("jadamisi ühendatud takistite kogutakistus: " + kogutakistusJ + " ohm");
        System.out.println("rööpselt ühendatud takistite kogutakistus: " + kogutakistusRoppselt + " ohm");
        
        sisend.close();
    }
}

    

