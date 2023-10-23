import java.util.Scanner;

public class george8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valik;

        do {
            
            
            System.out.println("1 ristkuliku pindala");
            System.out.println("2 ruudu pindala");
            System.out.println("3 valju");
            
            valik = scanner.nextInt();

            switch (valik) {
                case 1:
                ristkulik();
                    break;
                case 2:
                    ruut();
                    break;
                case 3:
                    
        }
    }           while (valik != 3);

        scanner.close();  
    }
    //arvutab ristkuliku pindala  ja kuvab selle välja 
    public static void ristkulik() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sisesta ristküliku pikkus: ");
        double pikkus = scanner.nextDouble();
        System.out.print("sisesta ristküliku laius: ");
        double laius = scanner.nextDouble();
        double pindala = pikkus * laius;
        System.out.println("ristküliku pindala on: " + pindala);
        scanner.close(); 
   
    }       //arvutab ruudu pindala  ja kuvab selle välja   
        public static void ruut() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sisesta ruudu külje pikkus: ");
        double kylg = scanner.nextDouble();
        double pindala = kylg * kylg;
        System.out.println("ruudu pindala on  " + pindala);
        scanner.close(); 
    
    

    }}



