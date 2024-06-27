package kursJava;

public class Butelka {
    
    private double ileLitrow;
    private double pojemnosc;

    Butelka(String slowo , double pojemnosc)
    {
        this.pojemnosc = pojemnosc;
    }
    Butelka(double ileLitrow)
    {
        this.ileLitrow = ileLitrow;
    }
    double getilePojemnosc()
    {
        return pojemnosc;
    }
    double getileListrow()
    {
        return ileLitrow;
    }
    int dolej(int ilosc , Butelka pojemnosc)
    {
        if(ilosc+ileLitrow<=pojemnosc.getilePojemnosc())
        {
            this.ileLitrow+=ilosc;
            return 0;
        }
        else{
            int miesci = (int)pojemnosc.getilePojemnosc() - (int)ileLitrow;
            this.ileLitrow = pojemnosc.getilePojemnosc();
            return miesci;
        }
    }
    boolean odlej(int ilosc)
    {
        if(ilosc<=ileLitrow)
        {
            this.ileLitrow-=ilosc;
        }
        else{
            return false;
        }
        return true;
    }    
    void przelej(int ilosc , Butelka gdziePrzelac , Butelka pojemnosc)
    {
        if(this.odlej(ilosc))
        {
            gdziePrzelac.dolej(ilosc , pojemnosc);
        }
        else{
            System.out.println("za mało");
        }
    }

    public static void main(String[] args) {
        
        Butelka[] poj = new Butelka[3];
        Butelka[] butelka = new Butelka[3];
        
        System.out.println("Butelki na samym początku(pojemnosc):\n");

        for(int i = 0;i<poj.length;i++)
        {
            int random = 20+(int)(Math.random()*20);
            poj[i] = new Butelka("V",random);
            System.out.println(poj[i].getilePojemnosc());
        }

        System.out.println("\nIle litrow w butelkach:\n");

        for(int i = 0;i<butelka.length;i++)
        {
            int random = 12+(int)(Math.random()*5);
            butelka[i] = new Butelka(random);
            System.out.println(butelka[i].getileListrow());
        }

        System.out.println("\nIle litrow po przelaniu:\n");

        butelka[0].przelej(15, butelka[1] , poj[1]);

        for(int i = 0;i<butelka.length;i++)
        {
            System.out.println(butelka[i].getileListrow());
        }
    }
}