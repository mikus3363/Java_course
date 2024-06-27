package kursJava;

public class lekcja_7_tablicej {
    public static void main(String[] args) {
        int tab[]=new int[5];
        //tab = new int[5];
        int tab2[]={1,2,3,4};
        int len;
        len=tab2.length;
        tab[0]=5;
        tab[1]=10;
        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab2[len-1]);
    }
}
