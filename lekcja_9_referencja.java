package kursJava;

public class lekcja_9_referencja {
    public static void main(String[] args) {
        
        int a = 53;
        int b=a;

        b=30;

        System.out.println(a);
        System.out.println(b);

        ads x = new ads(); // rezerwacja pamieci zmienna referencyjna

        ads y = x;
        y.a = 40;
        
        System.out.println(y.a);

        String imie = "Arek";
        String imie2 = new String(imie);

        imie2 = "Stachu";

        System.out.println(imie);
        System.out.println(imie2);
    }
}

class ads
{
    int a = 20;
}