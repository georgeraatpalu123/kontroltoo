import java.util.Scanner;

public class kt5 {  //alamprogramm
    public static double arvutaKoguTakistusJadamisi(int takistiteArv, Scanner sisend) {
        double kogutakistusJ = 0;
        // arvutus
        for (int i = 1; i <= takistiteArv; i++) {
            System.out.print("sisesta " + i + ". takisti takistus ohmides: ");
            double takistus = sisend.nextDouble();
            kogutakistusJ += takistus;
        }
        
        return kogutakistusJ;
    }
    //alamprogramm
    public static double arvutaKoguTakistusRoppselt(int takistiteArv, Scanner sisend) {
        double kogutakistusRoppselt = 0;
        
        for (int i = 1; i <= takistiteArv; i++) {
            System.out.print("Sisesta " + i + ". takisti takistus ohmides: ");
            double takistus = sisend.nextDouble();
            kogutakistusRoppselt = 1 / (1 / kogutakistusRoppselt + 1 / takistus);
        }
        
        return kogutakistusRoppselt;
    }
        
        public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.println("mitu takistit soovite uhendada: ");
        int takistiteArv = sisend.nextInt();
            //defineerib 
        double kogutakistusJ = arvutaKoguTakistusJadamisi(takistiteArv, sisend);
        double kogutakistusRoppselt = arvutaKoguTakistusRoppselt(takistiteArv, sisend);
            //kuvab välja 
        System.out.println("jadamisi uhendatud takistite kogutakistus: " + kogutakistusJ + " ohm");
        System.out.println("roopselt uhendatud takistite kogutakistus: " + kogutakistusRoppselt + " ohm");

        sisend.close();
    }
}
