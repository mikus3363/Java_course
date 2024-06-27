package kursJava;

public class lekcja_9_Obiekty{
    public static void main(String[] args) {
        Monitor Samsung = new Monitor();
        Samsung.szerokosc = 124;
        Monitor Sony = new Monitor();
        Sony.szerokosc = 152;  
        
        System.out.println(Samsung.szerokosc);
        System.out.println(Sony.szerokosc);
    }
}

class Monitor //klasa
{
    int szerokosc; //wlasciwosci
    int wysokosc;

    void wlacz() //metody
    {

    }
    void wylacz()
    {
        
    }
}