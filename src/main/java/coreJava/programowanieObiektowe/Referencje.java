package coreJava.programowanieObiektowe;

public class Referencje {

    public static void main (String[] args) {

        int a = 53;
        System.out.println(a);

        Test x = new Test();        // w x nie znajduje się żadna wartość zwykła TYLKO ADRES, czyli to jest tzw. zmienna referencyjna
    }

    static class Test
    {
        int a = 20;
    }

}
