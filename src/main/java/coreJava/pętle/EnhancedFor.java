package coreJava.pętle;

public class EnhancedFor {

    public static void main (String[] args) {

        String[] kursyProgramowania =      // Mamy tablicę w której znajduje się 8 Stringów
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

        for(String myValue: kursyProgramowania) // myValue to jest wymyślona nazwa zmiennej
        {
            System.out.println(myValue);
        }
    }
}
