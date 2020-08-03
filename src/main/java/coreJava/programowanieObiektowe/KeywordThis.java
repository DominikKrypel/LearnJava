package coreJava.programowanieObiektowe;

public class KeywordThis {

    public static void main(String[] args) {

        Punkt p = new Punkt(35, 50);

        System.out.println("p.x : " + p.x);
        System.out.println("p.y : " + p.y);

    }

    static class Punkt {

        Punkt(int x, int y) {   //parametry

            System.out.println("Wywołano konstruktor z dwoma parametrami");


            this.x = x;      // bez słowa kluczowego : this kompilator się myli czy chodzi o poniższe zmienne z klasy Punkt, czy chodzi o parametry
            this.y = y;

            /*

            this(p).x(35 linia) = x;
            this(p).y (36 linia)= y;

            tzn : 'this' zmienia swoją postać w zależności od tego na jakim obiekcie operujesz. 'this' to obiekt na którym aktualnie operujesz

             */


        }

        int x;          // poniższe zmienne z klasy Punkt
        int y;

    }




}