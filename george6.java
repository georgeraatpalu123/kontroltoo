import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class george6 {

//scannib
public static void main(String[] args) {
        ArrayList<Integer> arvud = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        
        //kasib sisestada arvu
        System.out.println("sisesta arvud"); 
        while (true) {
            String sisend = scanner.nextLine();

            
            // kui on tuhi voi ei ole taisarv siis utleb et viga
            if (sisend.isEmpty()) {                 
                break;
            }

            if (onTaikeTaisarv(sisend)) {                   
                try {
                    int arv = Integer.parseInt(sisend);         
                    arvud.add(arv);
                } catch (NumberFormatException e) {
                    System.err.println("vale");
                }
            } else {
                System.err.println( "sisesta ainult taisarv"); 
            }
        }

        
        
        
        
        scanner.close();

        
        //arvutab kokku arvud
        int summa = arvudeSumma(arvud);
        
        double keskmine = arvudeKeskmine(arvud);
        //kuvab arvud 
        System.out.println("summa" + summa);
        System.out.println("arvude keskmine" + keskmine);

        //salvestab anmded tekstifaili  
        try {
            salvestaAndmedFaili("numbeer.txt", arvud, summa, keskmine);
            System.out.println("andmed salvestatud."); 
        }       catch (IOException e) {
            System.err.println("error: " + e.getMessage()); 
        }
    }
    
    public static boolean onTaikeTaisarv(String sisend) {
        return sisend.matches("\\d+");
    }       //kontrollib täisarve
    public static int arvudeSumma(ArrayList<Integer> arvud) { 
        int summa = 0;
        for (int arv : arvud) {                            
            summa += arv;
        }
        return summa;
    }
        //kontrollib arvude keskmist
    public static double arvudeKeskmine(ArrayList<Integer> arvud) {
        if (arvud.isEmpty()) {
            return 0.0;                        
            
        }

        int summa = arvudeSumma(arvud);
        return (double) summa / arvud.size();
    }
            //salvestab andmed faili numbrid ja numbrite keskmin jms
    public static void salvestaAndmedFaili(String failinimi, ArrayList<Integer> arvud, int summa, double keskmine) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(failinimi))) {
            for (int arv : arvud) {
                writer.write(Integer.toString(arv));  
            }
        }
    }
}
