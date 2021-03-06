package coreJava.dziedziczenie.dziedziczenie.potwory;

public class Potwor {                        // Przykład klasy abstrakcyjnej. Nie zaprezentujemy w grze tej postaci. To nie jest Zombie, Szkielet
    public double predkoscChodzenia = 10;    //protected - chciałbym pozwolić Ci dziedziczyć po tym zawsze. Najczęściej na protected ustawia się metody
    public double zywotnosc;

    public void atakuj()        //dzieki słowu : 'public' mam dostęp do tej metody, która jest w innym package
    {

        /*
        Bazowe instrukcje ataku
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
        System.out.println("**************************************");
    }


}
