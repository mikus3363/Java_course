package kursJava;

//import java.util.ArrayList; //szybki dostęp do zawartości, bardzo wolna przy dodawaniu elementów oraz usuwaniu
//import java.util.LinkedList; //kolejne obiekty w liście wskazują na siebie, wolne przeszukiwanie, szybka modyfikacja


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class lekcja_16_listy {
    public static void main(String[] args) {
        //ArrayList lista1 = new ArrayList(7);

        ListaPolaczona lista2 = new ListaPolaczona();

        lista2.wartosc = 10;

        lista2.nastepna = new ListaPolaczona();

        lista2.nastepna.wartosc = 20;

        System.out.println(lista2.wartosc);
        System.out.println(lista2.nastepna.wartosc);


        LinkedList<String> listapow = new LinkedList<>();
        listapow.add("cosik1");
        listapow.add("cosik2");
        listapow.add("cosik3");
        listapow.add("cosik4");

        ListIterator<String> iter = listapow.listIterator(listapow.size()); //iterator ma n+1 pozycji

        while(iter.hasPrevious()){
            System.out.println(iter.previous());
            iter.set("cisikicosie");
        }
        iter = listapow.listIterator();
        iter.next();
        iter.add("nowycosik");

        lekcja_16_listy.WypiszelementyListy(listapow);
    }
    public static void WypiszelementyListy(LinkedList<?> lista){
        Iterator iterator = lista.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println();
    }
}

class ListaPolaczona
{
    int wartosc;
    ListaPolaczona nastepna;
}