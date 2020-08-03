package coreJava.programowanieObiektowe;

public class Metody {

    public static void main (String[] args) {

        System.out.println("korzystamy z klasy System");        // Klasa : System, która ma wyjście : out, i to wyjście ma metodę : ln.



        Test a = new Test();
        a.wypisz("Dominik");            //wywołaliśmy funckję/metodę. Odwołuję się przy pomocy nazwy : 'wypisz' do danej metody i następnie dajemy nawias co znaczy wywołaj
        int wynik = a.dodaj(5, 7);     // Przypisujemy do zmiennej : 'wynik'

        System.out.println(wynik);

        double wynikDzielenia = a.dzielenie(10, 0);

        System.out.println(wynikDzielenia);
    }



    static class Test
    {

        void wypisz(String imie)            //funkcja i metody w Javie służy do tego samego, teoretycznie w Javie nie ma funkcji
        {

            System.out.println("Test");
            System.out.println(imie);

        }

        int dodaj(int x, int y)             // metoda, która coś zwraca, bo nie ma słówka : 'void'
        {

            return x+ y;

        }

        double dzielenie ( double a, double b)      // metoda nazwana : 'dzielenie'
        {

            if(b ==0)
                return 0;                       // gdy w metodzie zostanie napotkana instrukcja : 'return' to instrukcje po tym nie zostaną wywołane

            System.out.println("Tralalalala");

            return a/b;



        }


        /*

        Metoda, żeby ją stworzyć piszemy najpierw typ zracany, np 'void', 'String' , następnie piszemy nazwę metody,
        powinna być self descriptive plus możemy określić  jakie parametry/zmienne lokalne chcemy stworzyć po czym ciało tej metody


         */


    }

}
