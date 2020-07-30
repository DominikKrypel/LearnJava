package coreJava.operatory;

public class OperatoryLogiczne {

    public static void main (String[] args) {

        /*
        Operatory Logiczne :

        !         - negacja
        !(true)   - false
        !(false)  - true
        &&        - koniunkcja, i to jest rezprezentowane przez nasze polskie słowo "I" i oznacza "w tym samym momencie"
                    true  true   - true
                    true  false  - false
                    false true   - false
                    false false  - false
                    KONIUNKCJA JEST PRAWDZIWA TYLKO GDY OBA WYRAŻENIA SĄ PRAWDZIWE

        ||        - alternatywa - "lub" - to lub też to
                    true  true   - true
                    true  false  - true
                    false true   - true
                    false false  - false
                    ALTERNATYWA JEST FAŁCZYWA TYLKO GDY OBA WYRAŻENIA SĄ FAŁSZYWE
         */


        //Przykłąd negacji

       int a = 3;
       int b = 5;
       int c = 6;

        if (!(a == b))
            System.out.println("Czy a nie jest równe b : TAK");
        else {
            System.out.println("Czy a nie jest równe b : NIE");
        }

        //Przykład koniunkcji

        if (a == b && c > 7)
            System.out.println("Koniunkcja, czy spełniam dwa wyrażenia : Tak");
        else {
            System.out.println("Koniunkcja, czy spełniam dwa wyrażenia : Nie");
        }

        //Przykład alternatywy

        if (a == b || c > 7)
            System.out.println("Alternatywa, czy spełniam przynajmniej jedno wyrażenie : Tak");
        else {
            System.out.println("Alternatywa, czy spełniam przynajmniej jedno wyrażenie : Nie");
        }
    }
}
