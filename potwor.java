package kursJava;

public abstract class potwor {
    
    public double speed;
    public double hp;

    public void atak()
    {


        System.out.println("To jest atak z klasy potwor");
    }
    abstract void opis();


    public potwor()
    {
        System.out.println("Domyslny konstruktor z potwor");
    }
    public potwor(double speed,double hp)
    {
        this.speed = speed;
        this.hp = hp;
        System.out.println("NieDomyslny konstruktor z potwor");
    }
}
