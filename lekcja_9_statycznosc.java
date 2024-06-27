package kursJava;

public class lekcja_9_statycznosc {  
    public static void main(String[] args) {
        
        // Matematyka test = new Matematyka(); Nie musimy tworzyć specjalnie klasy

        double wynik = Matematyka.dodaj(10, 15);

        System.out.println(wynik);
        System.out.println(Matematyka.PI);

        Klient a = new Klient("Arek");
        Klient b = new Klient("Wiola");
        Klient c = new Klient("Rafał");

        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);
    }
}

class Matematyka
{
    static double PI = 3.14;
    static double dodaj(double a,double b) //metoda istnieje zawsze static
    {
        return a+b;
    }
}
class Klient
{
    String imie;
    int id = 0;
    static int nastepneid = 0;
    Klient(String imie)
    {
        this.imie = imie;

        nastepneid++;
        id=nastepneid;
    }
}