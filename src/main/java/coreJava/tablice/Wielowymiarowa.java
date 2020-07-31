package coreJava.tablice;

public class Wielowymiarowa {

    public static void main (String[] args) {

          /*

        -------------------------------------
        |   [0][0]  |   [0][1]  |   [0][2]  |
        -------------------------------------
        |   [1][0]  |   [1][1]  |   [1][2]  |
        -------------------------------------
        |   [2][0]  |   [2][1]  |   [2][2]  |
        -------------------------------------
        |   [3][0]  |   [3][1]  |   [3][2]  |
        -------------------------------------
         */

        int[][] tab = new int[4][3]; // 4 wiersze i 3 kolumny. Tablicę numerujemy od 0

        tab[0][0] = 25;

        System.out.println(tab[0][0]);

        //Przykład nr 2 tworzenia tablicy - opcja szybsza

        int[][] tab2 =
        {
           {4, 15, 17},
           {5, 12, 125},
           {651, 1256, -24},
        };
        System.out.println("Wskazanie wartości w wierszu 3 i kolumnie 3 : " + tab2[2][2]);
    }
}
