import java.util.Scanner;

public class kt15 {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.print("sisesta isikukood: ");
        String isikukood = sisend.nextLine();
        sisend.close();
        
        // analuusib isikukoodi
        int sugu = Integer.parseInt(isikukood.substring(0, 1)) % 2 == 0 ? 2 : 1;
        String sünniaeg = isikukood.substring(1, 7);
       
        //kuvab soo ja synniaja
        System.out.println(" sugu" + (sugu == 1 ? "mees" : "naine"));
        System.out.println(" sünniaeg: " + sünniaeg);
    }
}
