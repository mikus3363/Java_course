package kursJava;

public class lekcja_9_zagn_praktyka {
    public static void main(String[] args) {
        KontoBan pierwszeKonto = new KontoBan(1000);

        System.out.println(pierwszeKonto.getStanKonta());

        pierwszeKonto.utworzKonto(5);

        System.out.println(pierwszeKonto.getStanKonta());

    }
}

class KontoBan
{
    public KontoBan(double stanKonta)
    {
        this.stanKonta = stanKonta;
    }

    private double stanKonta;

    double getStanKonta()
    {
        return this.stanKonta;
    }

    void utworzKonto(final double stopa)
    {
        class Odsetki
        {
            public Odsetki(double stopaProcentowa)
            {
                this.stopaProcentowa = stopaProcentowa;
                this.zmienStanKonta();
            }
            void zmienStanKonta()
            {
                double odsetki = (stanKonta * stopa) / 100;
                stanKonta += odsetki;
            }

            private double stopaProcentowa;
        }
        Odsetki odsetki = new Odsetki(stopa);
    }
}