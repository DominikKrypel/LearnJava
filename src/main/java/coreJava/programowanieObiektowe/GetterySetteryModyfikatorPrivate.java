package coreJava.programowanieObiektowe;

public class GetterySetteryModyfikatorPrivate {

    public static void main (String[] args) {

        /*
        Enkapsulacja (hermetyzacja) - pakowanie właściwości w taki sposób, aby nie było do nich bezpośredniego dostępu
        z innych klas

         */

       KontoBankowe oszczednosciowe = new KontoBankowe();
       oszczednosciowe.saldo = 100000;
       oszczednosciowe.setSaldo(444);
       oszczednosciowe.wyplac(5);

        System.out.println(oszczednosciowe.getSaldo());         // tutaj pokazaliśmy na zewnątrz saldo.

    }

    static class KontoBankowe {       // do private możemy się dostać wewnątrz tej klasy lub też ją zwrócić

        public KontoBankowe()
        {
            saldo = 1000;
        }

       private int saldo;

       int getSaldo ()                    // gettery i settery. Gettery są od pobierania wartości. Piszemy słowo : 'get' przed funkcją, która ma zwrócić wartość
       {
           return saldo;
       }

       void setSaldo(int saldo)
       {
           this.saldo = saldo;
       }

       boolean wyplac(int ile)
       {
           if (saldo < ile)
               return false;
           else
               setSaldo(saldo - ile);
           return true;
       }

    }
}
