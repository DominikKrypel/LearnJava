package coreJava;

public class KeywordThis {

    int a = 2; // w klasie używam zmiennej "a" do której mam przypisaną wartość 2


public void getData(){
    int a = 3; /* w tej metodzie używam zmiennej "a" do której mam przypisaną wartość 3 i to jest lokalna zmienna, która żyje
    w tej metodzie */
    System.out.println(a);

    // w bloku getData chcę wydrukować zmienną a do której jest przypisana wartość 2.
    // this odnosi się do bieżącego obiektu, który jest na poziomie klasy

}

    public static void main(String[] args){

    KeywordThis kt = new KeywordThis();
        kt.getData();


    }


}