package kursJava;

public class lekcja_9_metody {
    public static void main(String[] args) {
        
        Test imie = new Test();

        imie.wypisz("Arek");

        int wiek = imie.dodaj(12, 13);

        System.out.println(wiek);
    }
}

class Test
{
    void wypisz(String slowo)
    {
        System.out.println(slowo);
    }

    int dodaj(int a,int b)
    {
        return a+b;
    }
}