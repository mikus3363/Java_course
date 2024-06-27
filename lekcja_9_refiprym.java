package kursJava;

public class lekcja_9_refiprym {
    public static void main(String[] args) {
        
        int a = 5;

        Prym x = new Prym();

        a = x.zmienwartosc(a); //bez zwracania w klasie i takiego zapisu a = 5 nadal

        System.out.println(a);

        sameAdress adres = new sameAdress();

        x.zmienZawartosc(adres);

        System.out.println(adres.y);
    }
}

class Prym
{
    int zmienwartosc(int zm)
    {
        zm = zm + 2; // różny adres zmiennych
        return zm;
    }
    void zmienZawartosc(sameAdress zm) //nowa kopia ale ten sam adres
    {
        zm.y = zm.y + 30; //możliwość zmiany bez problemu bo zmienne mają ten sam adres
    }
}

class sameAdress
{
    int y = 20;
}