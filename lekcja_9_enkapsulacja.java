package kursJava;

public class lekcja_9_enkapsulacja {
    public static void main(String[] args) {

        KontoBankowe oszczednosciowe = new KontoBankowe();
        oszczednosciowe.wplac(5000);
        if(oszczednosciowe.wyplata(4234))
        {
            System.out.println("Wyplacono");
        }
        else{
            System.out.println("Za malo siana");
        }
        System.out.println(oszczednosciowe.getSaldo());
    }
}

class KontoBankowe
{
    public KontoBankowe()
    {
        saldo = 1000;
    }
    private int saldo;

    int getSaldo()
    {
        return saldo;
    }

    private boolean setSaldo(int saldo)
    {
        //warunki np jakies haslo
        this.saldo = saldo; 

        return true;
    }

    boolean wyplata(int ile)
    {
        if(saldo<ile)
        {
            return false;
        }
        else{
            setSaldo(saldo-ile);            
        }

        return true;
    }
    boolean wplac(int ile)
    {
        setSaldo(saldo+ile);
        return true;
    }
}