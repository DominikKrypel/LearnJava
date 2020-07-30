package coreJava.instrukcjeWarunkowe;

public class instrukcjaWarunkowaSwitch {

    public static void main(String[] args) {

        /*
        Switch (przełącznik)

         */

        int a = 50;
        switch (a)       // instrukcja "switch" jest przerywana
        {
            case 50:
                System.out.println("a jest równe 50");
                break; // wyjście z przełącznika "switch", jeżeli by nie było słowa "break" to by się wykonały poniższe instrukcje
            case 100:
                System.out.println("a jest równe 100");
                break;
            default: // domyślnie
                System.out.println("a jest inną wartością : " + a);
        }

        System.out.println("*****************************");

        switch (a)       // instrukcja "switch" nie jest przerywana
        {
            case 50:
                System.out.println("a jest równe 50");
            case 100:
                System.out.println("a jest równe 100");
            default: // domyślnie
                System.out.println("a jest inną wartością : " + a);


        }
    }
}
