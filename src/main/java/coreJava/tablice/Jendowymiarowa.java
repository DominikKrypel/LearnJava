package coreJava.tablice;

public class Jendowymiarowa {

    public static void main (String[] args) {  // args, z angielskiego arguments to jest nazwa zmiennej

        /*

        ----------------------------------
        tab[0] tab[1] tab[2] tab[3] tab[4]

         */

        int[] tab; // To jest zadeklarowanie tablicy


        tab = new int[5];   //rezerwujemy miejsce w pamięci, czyli przypisujemy do tego tab-a. Liczba 5 mówi jak dużo chcemy zarezerwować miejsc całkowitych
                            // to jest miejesce w do którego mamy dostęp

        tab[0] = 20; // tutaj przypisałem wartości
        tab[1] = 7;
        tab[2] = 27;
        tab[3] = 15;
        tab[4] = 77;

        System.out.println("Wskazuję pierwszą wartość w tablicy (tab) : " + tab[0]); /*numerujemy i indeksujemy tablice od 0.
        Dla typu zmiennej int jeżeli nie nadamy wartości to domyślna wartość będzie 0
        */

        System.out.println("***************************************");
        //Przykład nr 2 tworzenia tablicy - opcja szybsza

        int[] tab2 = {4, 14, 4, 213};
        System.out.println("Wskazuję ostatnią wartość w tablicy (tab2): " + tab2[3]);
        System.out.println("Przykład 2, wskazuję ostatnią wartość w tablicy (tab2): " + tab2[tab2.length-1]);
        System.out.println("Długość mojej tablicy (tab2) wynosi: " + tab2.length);

    }
}
