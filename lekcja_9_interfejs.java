package kursJava;

import java.util.Arrays;
import java.util.Collections;

public class lekcja_9_interfejs {
    public static void main(String[] args) {
        
        //((Pracus)a).getWynagrodzenie(); //rzutowanie w dół

        int[] tab = new int[3];

        tab[0] = 3;
        tab[1] = -15;
        tab[2] = 1;

        Arrays.sort(tab); //sortowanie

        //System.out.println(tab[0]);// po sortowaniu wywołanie elementu -15

        Pracus[] pracownik = new Pracus[3];
        pracownik[0] = new Pracus(10000);
        pracownik[1] = new Pracus(1000);
        pracownik[2] = new Pracus(5000);

        //Arrays.sort(pracownik);
        System.out.println(pracownik[0].compareTo(pracownik[1]));

        System.out.println("Przed sortowaniem");
        for(Pracus p: pracownik){
            System.out.println(p.getWynagrodzenie());
        }
        Arrays.sort(pracownik,Collections.reverseOrder());

        System.out.println("Po sortowaniu");

        for(Pracus p: pracownik){
            System.out.println(p.getWynagrodzenie());
        }
    }
}

/**
 * Innerlekcja_9_interfejs
 */
interface nazwaInterfejsu 
{
    double Pi = 3.14; //public static final
    
    void cos(); //public abstract
}
interface cosik
{

}

class Pracus implements nazwaInterfejsu , cosik , Comparable //mozna wiele przypisac
{
    @Override
    public void cos()
    {
        throw new UnsupportedOperationException("Not supported yet");
    }
    Pracus(double wynagrodzenie)
    {
        this.wynagrodzenie = wynagrodzenie;
    }
    private double wynagrodzenie;
    public double getWynagrodzenie(){
        return this.wynagrodzenie;
    }
    @Override
    public int compareTo(Object o) //porownanie
    { 
        Pracus przeslany = (Pracus)o;

        if(this.wynagrodzenie<przeslany.wynagrodzenie){
            return -1;
        }
        if(this.wynagrodzenie>przeslany.wynagrodzenie){
            return 1;
        }
        return 0;
    }
}

class dawda extends Pracus //nie ma wielodziedziczenia
{

    dawda(double wynagrodzenie) {
        super(wynagrodzenie);
        //TODO Auto-generated constructor stub
    }
}
