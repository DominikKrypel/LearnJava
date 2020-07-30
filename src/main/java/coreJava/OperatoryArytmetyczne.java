package coreJava;

public class OperatoryArytmetyczne {

    public static void main (String[] args) {

        /*
        OPERATOR - to znaki służące do operowania na zmiennych

        OPERATORY ARTMETYCZNE :
        + dodawanie liczb oraz łączenie string'ów
        - odejmowanie
        * mnożenie
        / dzielenie

        = przypisanie wartości
        +=
        -=
        /=
        *=
        %=

        % reszta z dzielenia (dzielenie modulo)

        ++ inkrementacja - powiększ o 1
        -- dekremantacja - zmniejsz o 1

        y++ - POST inkrementacja
        y-- - POST dekrementacja

        ++y - PRE inkrementacja
        --y - PRE dekrementacja

         */

        int a = 5;
        a += 2; // zwiększyłem wartość zmiennej o 2

        System.out.println("zwiększyłem wartość zmiennej 5 o 2 i wyszedł wynik " + a);

        //Dzielenie modulo//
        int b = 3 % 3; // w tym przypadku nie ma reszty. Często przydaje się w programowaniu

        System.out.println("Wynik dzielenia modulo " + b);

        //++y - PRE inkrementacja
        int c = 5;

        System.out.println("Najpierw mi powiększ i później wydrukuj " + ++c);

        // y-- - POST dekrementacja
        int d = 8;
        System.out.println("Najpierw mi wydrukuj i później pomniejsz " + d--);
    }
}
