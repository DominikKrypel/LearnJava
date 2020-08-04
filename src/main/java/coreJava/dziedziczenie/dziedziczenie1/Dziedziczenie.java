package coreJava.dziedziczenie.dziedziczenie1;

import coreJava.dziedziczenie.dziedziczenie.potwory.Potwor;
import coreJava.dziedziczenie.dziedziczenie.potwory.Szkielet;
import coreJava.dziedziczenie.dziedziczenie.potwory.Zombie;

public class Dziedziczenie {

    public static void main (String[] args) {

        Potwor p = new Potwor(10, 233);
        p.atakuj();                 //żeby mieć do tego dostęp muszę mieć wartości public przy tych metodach w Klasie 'Potwór'
        System.out.println(p.predkoscChodzenia);

        Szkielet s = new Szkielet(20, 50);
        System.out.println(s.predkoscChodzenia);
        Zombie z = new Zombie();

    }

}
