import java.util.Scanner;

public class kt14 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String numbrimark = numbrimark(scanner);
            System.out.println("Suvaline numbrimärk: " + numbrimark);
            scanner.close();
        } catch (Exception e) {
            System.out.println("Viga: " + e.getMessage());
        }
    }

    //defineerib tähed 
    public static String numbrimark(Scanner scanner) {
        String tähed = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder numbrimark = new StringBuilder();

        // loob kolm suvalist numbrit
        for (int i = 0; i < 3; i++) {
            int number = (int) (Math.random() * 10);
            numbrimark.append(number);
        }

        // loob kolm suvalist tahte
        for (int i = 0; i < 3; i++) {
            int index = (int) (Math.random() * tähed.length());
            char täht = tähed.charAt(index);
            numbrimark.append(täht);
        }

        return numbrimark.toString();
        
        
    
    
}
//alamprog
 public static int number() {
        return (int) (Math.random() * 10);
}}
