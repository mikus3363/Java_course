package kursJava;

public class zombie extends potwor
{
    public zombie()
    {
        System.out.println("Domyslny konstruktor z zombie");
    }
    public zombie(double speed,double hp)
    {
        super(speed,hp);
        System.out.println("NieDomyslny konstruktor z zombie");
    }
    @Override
    void opis() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'opis'");
    }
}

