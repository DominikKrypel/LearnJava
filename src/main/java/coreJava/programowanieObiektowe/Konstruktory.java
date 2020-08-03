package coreJava.programowanieObiektowe;

public class Konstruktory {

    public static void main(String[] args) {

        Punkt p = new Punkt(35, 50);  // nawiasy dotyczą wywołanie czegoś, w naszym wypadku jest to konstruktor.
        // 35 i 50 to są argumenty przesyłane do parametrów int pierwszy, int drugi

        System.out.println("p.x : " + p.x);
        System.out.println("p.y : " + p.y);

    }

    static class Punkt {
        Punkt()           // tworzymy własny kontruktor. Piszemy słowo rezprezentujące nazwę tej klasy
        {

            System.out.println("Wywołano konstruktor domyślny");

        }

        Punkt(int pierwszy, int drugi) {        // int pierwszy i drugi to są zmienne/parametry, które zadeklarowałem dla kontruktora tymczasowo, czyli one żyją w klamerce
            // int pierwszy i drugi to są parametry do których możemy przysłać wartości z zewnątrz

            System.out.println("Wywołano konstruktor z dwoma parametrami");


            x = pierwszy;
            y = drugi;
        }

        int x;
        int y;

    }

}
