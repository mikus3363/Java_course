package kursJava;

public class lekcja_9_instanceof {
    public static void main(String[] args) 
    {
        //Osoba osoba = new Osoba() NIE MOZNA
        Osobaa[] osoba = new Osobaa[4];
        osoba[0] = new Pracow("Arek","Nowak",1800);
        osoba[1] = new Studen("Ala","Szwarc");
        osoba[2] = new Pracow("Marek", "Siewie", 2000);
        for(int i = 0;i<osoba.length;i++)
        {
            if(osoba[i] instanceof Pracow){
                ((Pracow)osoba[i]).pobierzOpis();
                ((Pracow)osoba[i]).pracuj();
            }
        }

    }
}
abstract class Osobaa
{
    String imie;
    String nazwisko;

    Osobaa(String imie,String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    abstract void pobierzOpis();
}
class Pracow extends Osobaa
{
    double wynagrodzenie;
    Pracow(String imie,String nazwisko,double wynagrodzenie)
    {
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }
    @Override
    void pobierzOpis() 
    {
        System.out.println("Jestem strażakiem");
        System.out.println("Imie: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Wynagrodzenie: "+wynagrodzenie);
    }
    void pracuj()
    {
        System.out.println("Pracuje");
    }
}
class Studen extends Osobaa
{
    Studen(String imie,String nazwisko)
    {
        super(imie,nazwisko);
    }

    @Override
    void pobierzOpis() 
    {
        System.out.println("Jestem studentem");
        System.out.println("Imie: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
    }
}