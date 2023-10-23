import java.util.Scanner;



public class george4 {
    public static void main(String[] args) {   
        Scanner scan = new Scanner(System.in);

        System.out.println("Kirjuta oma nimi");
        String Eesnimi= scan.nextLine();
        System.out.println(Eesnimi.toUpperCase());
        System.out.println(Eesnimi.length());
        String[] sonad = Eesnimi.split(" ");
        System.out.println(Eesnimi.length());
        System.out.printf("Esimene sona oli '%s'", sonad[0]);
        scan.close();
        
    }
}

            