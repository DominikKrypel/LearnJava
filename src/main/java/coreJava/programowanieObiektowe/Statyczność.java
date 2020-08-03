package coreJava.programowanieObiektowe;

public class Statyczność {

    /*

    Jeżeli jesteś w statycznej metodzie to ona istnieje zawsze, skoro istnieje zawsze to ona nie ma mieć prawa to rzeczy, które nie istnieją zawsze

     */



    public static void main (String[] args) {              // w metodzie main zawsze jest słowo : 'static' i dzięki temu nie musieliśmy tworzyć instancji ten klasy 'Statyczność'
        Matematyka test = new Matematyka();                // po dodaniu słowa : 'static' w wierszu (static double dodaj), nie potrzebujemy tworzyć instancji,
                                                           // czyli linijki (Matematyka test = new Matematyka().
        double wynik =  test.dodaj(20, 34);
        // po dodaniu słowa : 'static' w wierszu (static class Matematyka), możemy dostać się do metody w taki sposób : 'double wynik =  Matematyka.dodaj(20, 34);'


        System.out.println(wynik);

        System.out.println("PI równa się : " + Matematyka.PI);      // dzięki słowu : 'static' w wierszu (static final double) mogę bezpośrednio odwołać się do tego PI, do tej metody
                                                                    // nie musimy specjalnie tworzyć instancji

        Klient a = new Klient("Arkadiusz");
        Klient b = new Klient("Dominik");
        Klient c = new Klient("Ania");


        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);
    }


    static class Matematyka
    {

        static final double PI = 3.14;

        static double dodaj (double a, double b) {      // dopisaliśmu słowo : 'static' , czyli statyczny, zwsze instenijący
            return a + b;
        }

    }

    static class Klient

    {
        Klient(String imie){           // konstruktor : 'Klient'
            {
                this.imie = imie;
                nestepnyId++;           // to jest stałe
                id = nestepnyId;
            }

    }
        String imie;
        int id = 0;
        static int nestepnyId = 0;          // dzięki temy słowu : 'static', możemy przetrzymywać coś co jest wspólne dla wsxzystkich
    }


}
