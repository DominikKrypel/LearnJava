package coreJava.zmienne;

public class Zmienne {

    public static void main (String[] args) {

        //Zmienne są przechowywane w pamięci RAM.

        // integer - liczba całkowita
        int a = 10; // zarezerwuj mi w pamięci 32 Bity czyli 4 Bajty

        String imie = "Dominik";

        long b = 12212312121L; // pamiętać, żeby na końcu dodać L
        long c;
        byte d = 127;
        short e = 3334;

        c = a + b;

        System.out.println(c + " " + imie + " " + d + " " + e);

        /*
        Jakie mamy typy?

        a) Typy całkowite :
        byte - 8 Bit - od -128 do 127
        short - 16 Bit - od -32,768 do 32,767
        int - 32 Bity - od -2^31 do 2^31 - 1
        long - 64 Bit - od -2^63 do 2^63 - 1

        b) Znakowe:
        char - 2 Bajtowy - nie możemy wieęcej niż jednego znaku
        String - ciąg znaków

        c) Zmienne zmiennoprzecinkowe:
        float - 32 Bity - 1,4 * 10 ^ -45 do 3,4 * 10 ^ 138 -  z Float raczej się nie korzysta, chyba, że mamy mało miejsca w pamięcie RAM
        double - 64 Bity - od 4,9 * 10 ^ -324 do 1,8 * 10 ^ 308 - prawie zawsze powinienem stosować double


         */
        char znak = 'A';
        System.out.println(znak);

        float liczba2 = 4.57f; // pamiętać, żeby na końcu dodać f
        double liczba3 = 5.472323;

        System.out.println(liczba2);
        System.out.println(liczba3);

        /*
        Przy definiowaniu zmiennnych wielkość ma znaczenie

        Konwencja przyjęła się taka, że nazwę zmiennej powinno się zaczynać z małej litery
         */

        String imie2 = "Dominik";
        String Imie2 = "Ania"; // tu jest przykład błędnego zapisania zmiannej, powinno być z małej lietry

        imie2 = "Lucy"; // tutaj zmieniłem wartość zmiennej "imie2" i już nie muszę wskazywać typu

        System.out.println("zmienna z małej litery: " + imie2);
        System.out.println("zmienna z dużej litery: " + Imie2);

        /*
        NIE WOLNO :
        1) używać w nazwie zmiennej keywordów
        2) rozpocząć nazwy zmiennej od liczby
        3) korzystać  w nazwie zmiennej ze spacji
         */

        final double LICZBA_PI = 3.14; // tak opisujemy stałą, nie ma możliwości podmiany wartości tej zmiennej na inną

        System.out.println("To jest wartość stała " + LICZBA_PI);

    }
}
