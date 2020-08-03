package coreJava.programowanieObiektowe.pakunki; // package służy do pakowania/upakowania podobnych tematycznie do siebie klas

public class PakunkiIModyfikatory {

    public static void main (String[] args) {  // jeżeli chcemy, żeby dana klasa nie była wykorzystywana w innych pakunkach to usuwamy słowo public


        System.out.println(Test.a);
        Test.a = 10;
    }

    public static class Test {

       public static int a = 5;


        /*
        --------------------------------------------------------------------------------------
        |      Modyfikator   | Klasa  |	Pakiet	|  Podklasa	 |  Inni   |  Poprawny dla klas  |
        --------------------------------------------------------------------------------------
        |       public	     |  tak	  |  tak    |    tak	 |   tak   |        tak          |
        --------------------------------------------------------------------------------------
        |      protected	 |  tak   |  tak    |    tak	 |   nie   |        nie          |
        --------------------------------------------------------------------------------------
        |  brak modyfikatora |  tak	  |  tak    |    nie	 |   nie   |        tak          |
        --------------------------------------------------------------------------------------
        |       private	     |  tak	  |  nie    |    nie	 |   nie   |        nie          |
        -------------------------------------------------------------------------------------|

        */

    }

}
