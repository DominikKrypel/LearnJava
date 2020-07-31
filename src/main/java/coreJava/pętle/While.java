package coreJava.pętle;

public class While {
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

        int i = 0;
        while(i < kursyProgramowania.length)  // W nawiasie podajemy warunek pętli, jeżeli i jest mniejsze od 7 to chce, żeby była wykonywana jakaś instrukcja, która jest podana w klamrach
        {                                       // kursyProgramowania.length - odwołałem się do tablicy i pobrałem zawartość lenght, dzięki temu mam aktualną wartość tablicy
            System.out.println(kursyProgramowania[i]);
            i++;
        }

        System.out.println("****************************************");
        //Przykład z zagnieżdżeniem if w pętli while

        i = 0; // tutaj zerujemy i, nie musimy już podawać typu zmiennej

        while(i < kursyProgramowania.length)
        {
            if (i != 3)            // tutaj wskazałem warunek, że jeśli zmienna i będzie miała wartość 3 to ma nie być wydrukowana
                System.out.println(kursyProgramowania[i]);
            i++;
        }

        System.out.println("****************************************");
        //Przykład pętli: do while

        i = 0;

        do     // rób wszystko co znajduje się pomiędzy klamrami dopóki warunek który jest w nawiasie po while jest warunkiem prawdziwym
        {       // pętla (do - while) chce zastosować wtedy, kiedy nie interesuej Cię to czy warunek na samym starcie musi być sprawdzony
            System.out.println(kursyProgramowania[i]);
            i++;
        }

        while(i < kursyProgramowania.length);

    }
}
