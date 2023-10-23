public class george9 {
    
    public static void main(String[] args) {
       //loon tsikkli ja mercedese
        Tsikkel Mercedes = new Tsikkel("mercedes "  ,2023);
        Soitja soitja1 = new Soitja("kallle");
       //panen tsikkli toole
        Mercedes.käivita();            
    soitja1.soida(Mercedes);       
       
}
}
// teen tsikkli klassi
class Tsikkel {
    private String mudel;

    public Tsikkel(String mudel, int tootmisaasta) {
        this.mudel = mudel;
        System.out.println("Tsikkli aasta" + tootmisaasta);
    }

    public void käivita() {
    System.out.println(mudel + " pandi tööle");
    }

    public String toString() {
        return mudel;
}
}


class Soitja {
    // loon nime 
    public String nimi;
    public Soitja(String nimi) {
    this.nimi = nimi;
    }// panen tsikkli soitmaw ja kuvan valja
    public void soida(Tsikkel tsikkel) {
        System.out.println(nimi + " soidab " + tsikkel + " tsikkliga.");
    }
    
    
public String toString() {
        return nimi;
    
    
    
}
}


