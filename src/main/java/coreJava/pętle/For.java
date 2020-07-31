package coreJava.pętle;

public class For {

    public static void main (String[] args) {

        String[] kursyProgramowania =      // Mamy tablicę w której znajduje się 6 Stringów
                {
                        "Java",
                        "Java Aplikacje",
                        "Java Strumienie",
                        "Java Aspekty Zaawansowane",
                        "Java Android",
                        "C#",
                        "C# Tworzenie Apliakcji",
                        "Python"
                };

    // (INICJALIZACJA ZMIENNYCH ; WARUNEK PĘTLI ; CO MA SIĘ STAĆ PO WYKONANIU WSZYSTKICH INSTRUKCJI W PĘTLI)
        for(int i = 0;i < kursyProgramowania.length;i++)      // pętla "for" różni się od "while" tym, że mam możliwość ...
        {                                                     //...dodania średników w nawiasie, czyli mam wszystko w jednym miejscu
            System.out.println(kursyProgramowania[i]);

        }

        System.out.println("***************************");

        int[] liczby = {1, 3, 5, 6, 8,10};

        int suma = 0;

        for (int i = 0; i < liczby.length; i++) {

            suma = suma + liczby[i];

        }

        System.out.println("Suma liczb : " + suma);

    }
}
