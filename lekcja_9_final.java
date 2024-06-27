package kursJava;

import java.util.Date;

public class lekcja_9_final {
    public static void main(String[] args) {
        
        //final double PI;

        Pracownik p = new Pracownik();

        System.out.println(p.dataZatrudnienia);
    }
}

abstract class Osoba
{

}

class Pracownik extends Osoba
{

    final Date dataZatrudnienia; //nie można nadpisać
    Pracownik()
    {
        this.dataZatrudnienia = new Date();
    }
    Pracownik(Date data)
    {
        this.dataZatrudnienia = data;
    }
    Date getDataZatrudnienia()
    {
        return this.dataZatrudnienia;
    }
}
class Programista extends Pracownik
{
    
}