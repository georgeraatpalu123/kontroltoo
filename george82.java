public class george82 {
    public static void main(String[] args) {
        Ylmees mees = new Ylmees("peeter", "suur", "eesti");
        mees.tutvustaEnd();
    }
}

class Ylmees {
    private String nimi;
    private String suurus;
    private String rahvus;

    public Ylmees(String nimi, String suurus, String rahvus) {
        this.nimi = nimi;
        this.suurus = suurus;
        this.rahvus = rahvus;
    }
    
public void tutvustaEnd() {
        System.out.println("nimi: " + nimi);
        System.out.println("suurus: " + suurus);
        System.out.println("rahvus: " + rahvus);
    }
}
