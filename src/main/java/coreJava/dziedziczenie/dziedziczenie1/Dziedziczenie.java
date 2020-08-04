package coreJava.dziedziczenie.dziedziczenie1;

import coreJava.dziedziczenie.dziedziczenie.potwory.Potwor;
import coreJava.dziedziczenie.dziedziczenie.potwory.Szkielet;
import coreJava.dziedziczenie.dziedziczenie.potwory.Zombie;

public class Dziedziczenie {

    public static void main (String[] args) {

        Potwor p = new Potwor(10, 233);
        System.out.println(p.predkoscChodzenia);

        Potwor ps = new Szkielet(10, 233); // Stworzenie instacji i Szkieleta i Potwora. Rodzic może wsakzywać na dziecko
        ps.atakuj();                                                   // Zostały wywołane dwa konstruktory, z klasy : 'Szkielet' i klasy 'Potwór'. To jest POLIMORFIZM

        Szkielet s = new Szkielet(20, 50);
        System.out.println(s.predkoscChodzenia);
        s.atakuj();
        Zombie z = new Zombie();

    }

}
