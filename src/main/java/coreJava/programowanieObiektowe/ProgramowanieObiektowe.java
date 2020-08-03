package coreJava.programowanieObiektowe;

public class ProgramowanieObiektowe {

    public static void main (String[] args) {   // W klasie : ProgramowanieObiektowe mam funkcję: main

        /*

        Obiekty     -   to pojemniki do przechowywania zmiennych i funkcji (metod) tematycznie
                    ze sobą powiązanych do dalszego łatwiejszego ponownego użycia.

        Klasy       -   foremki do tworzenia egzamplarzy obiektów.

        Properites  - właściwości
        Metody      - funkcje

         */

        Monitor abc = new Monitor();
        abc.szerokosc = 124;

        Monitor abc2 = new Monitor();
        abc2.szerokosc = 555;

        System.out.println(abc.szerokosc);
        System.out.println(abc2.szerokosc);


    }

    static class Monitor {     //utworzyliśmy klasę czyli formę do stworzenia monitora.

        int szerokosc;  // Właściwości, inaczej Properies - opisujące monitor
        int wysokosc;

        void wlacz () {     // najlepiej metody nazywać z małych liter


        }

        void wylacz () {    //Mamy dwie metody/funkcje: Włącz i Wyłącz. Nawiasy informują, że mamy do czynienia z funkcjkcją bądź metodą.
                            //Metody/funkcje określają zachowanie, czyli czynności jakie mogą być wykonane przez daną klasę


        }

    }

}
