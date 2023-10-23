//George Raatpalu
import java.util.Scanner;

public class george5 {
    public static void main(String[] args) {
        Scanner sisestus = new Scanner(System.in);
        //kuvab terminali teksti
        System.out.print("Sisesta esimene arv: ");      
        double arv1 = sisestus.nextDouble();
        //kuvab terminali teksti
        System.out.print("Sisesta teine arv: ");        
        double arv2 = sisestus.nextDouble();
        
        
        //arvutab tulemuse ja nulliga ei saa jagada
         if (arv2 != 0) {
            double tulemus = arv1 / arv2;
            System.out.println("Jagamistulemus: " + tulemus);       
        } else {
            System.out.println("nulliga ei saa jagada");      
        }
        
        sisestus.close();
    }
}
