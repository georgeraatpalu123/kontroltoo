import java.util.Scanner;

public class kt15 {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.print("Sisesta isikukood: ");
        String isikukood = sisend.nextLine();
        sisend.close();

        //try and catch 
        try {
            analüüsiIsikukood(isikukood);
        } catch (NumberFormatException e) {
            System.out.println("vale");
        } catch (IllegalArgumentException e) {
            System.out.println("vale");
        }
    }
        //arvutused
    public static void analüüsiIsikukood(String isikukood) {
        int sugu = Integer.parseInt(isikukood.substring(0, 1)) % 2 == 0 ? 2 : 1;
        String sünniaeg = isikukood.substring(1, 7);
            // kuvab isikukoodid ja sunniajad
        System.out.println("Sugu: " + (sugu == 1 ? "mees" : "naine"));
        System.out.println("Sünniaeg: " + sünniaeg);
    }
}
