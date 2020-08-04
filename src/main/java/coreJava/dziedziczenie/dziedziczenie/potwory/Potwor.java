package coreJava.dziedziczenie.dziedziczenie.potwory;

public class Potwor {
    public double predkoscChodzenia = 10;
    public double zywotnosc;

    public void atakuj()        //dzieki słowu : 'public' mam dostęp do tej metody, która jest w innym package
    {

        /*
        domyślna implementacja ataku
         */

        System.out.println("To jest metoda atakuj z klasy Potwór");
    }

    public Potwor()
    {
        System.out.println("Domyślny konstruktor z klasy Potwór");
    }

    public Potwor(double predkoscChodzenia, double zywotnosc)
    {
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
        System.out.println("Niedomyślny konstruktor z klasy Potwór");
    }


}
