package coreJava.pętle;

public class BreakContinue {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 3)
                continue; // przerwij iteracje od tego momentu i nie wykonuj już żadnych instrukcji po mnie.
            //kontynuuj wykonywanie całej pętli ale bez tego przejści, czyli co będzie po tym, czyli od lini 10 do lini 13
            System.out.println(i);

        }

        System.out.println("******************************");


        for (int i = 0; i < 10; i++) {
            if (i == 3)
                break; // wyjście z pętli

            System.out.println(i);

        }
    }
}
