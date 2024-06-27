package kursJava;

public class szkielet extends potwor
{
    String typBroni;

    public void atak()
    {
        super.atak();
        /*
         * dodatkowe info o ataku
         */

        System.out.println("To jest atak z klasy szkielet");//nadpisanie atak potwor
    }

    public szkielet()
    {
        System.out.println("Domyslny konstruktor z szkielet");
    }
    public szkielet(double speed,double hp)
    {
        super(speed,hp);
        System.out.println("NieDomyslny konstruktor z szkielet z dwoma");
    }
    public szkielet(double speed,double hp,String typBroni)
    {
        super(speed,hp);
        this.typBroni = typBroni;
        System.out.println("NieDomyslny konstruktor z szkielet z trzema");
    }

    @Override
    void opis() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'opis'");
    }
}
