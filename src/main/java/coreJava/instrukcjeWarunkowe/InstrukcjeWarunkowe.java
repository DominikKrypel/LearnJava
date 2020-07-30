package coreJava.instrukcjeWarunkowe;

public class InstrukcjeWarunkowe {

    public static void main(String[] args){

        /*
        INSTRUKCJE WARUNKOWE

         */

        int a = 3;
        int b = 5;
        int c = 9;

        //Przykład 1

        if (a == b)
            System.out.println("Czy a jest równe b : Tak");

        else
            System.out.println("Czy a jest równe b : Nie");

        //Przykład 2

        if (a > b)
            System.out.println("Czy a jest większe od b : Tak");
        else if (a < b) {
            System.out.println("Czy a jest większe od b : Nie");
            System.out.println("Czy a jest większe od b : Nie number 2"); // jak jest wiele instrukcji to potrzebujemy nawias klamrowy, czyli grupujemy instrukcje
        }
        else
            System.out.println("Czy a jest większe od b : Nie, jest równe"); // Nie jest w nawiasie klamrowym ale jeżeli spełni warunek to się wykona bo jest bezpośrenio pod "else"
            System.out.println("Ta instrukcja jest bez klamry, czyli i tak się wykona, nie istotne czy else spełnia warunek"); // nie jest w nawiasie klamrowym, czyli i tak się wykona

    }
}
