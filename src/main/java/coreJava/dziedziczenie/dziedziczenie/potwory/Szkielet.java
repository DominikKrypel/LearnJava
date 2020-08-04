package coreJava.dziedziczenie.dziedziczenie.potwory;

public class Szkielet extends Potwor {              // extends - rozszerz/odzedzicz
        public Szkielet(){
            System.out.println("Domyślny konstruktor z klasy Szkielet");
        }

        public Szkielet(double predkoscChodzenia, double zywotnosc){

            super(predkoscChodzenia, zywotnosc);                                 // wywołaj mi konstruktor z Klasy wyżej. Super klasa to jest tak jakby ta bazowa i prześlijmy...
            System.out.println("Niedomyślny konstruktor z klasy Szkielet");         //...tam prędkosśćChodzenia i żywotność
        }
}
