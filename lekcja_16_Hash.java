package kursJava;

public class lekcja_16_Hash {
    public static void main(String[] args) {
        Element a = new Element(5);
        Element b = new Element(5);
        Element c = null;
        System.out.println(a.equals(c));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}

class Element implements Comparable
{
    int wartosc;
    String opis;
    public Element(int wartosc){
        this.wartosc = wartosc;
    }
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || this.getClass()!=obj.getClass()) return false;
        return this.wartosc == ((Element)obj).wartosc;
    }
    public int hashCode(){
        int hash = 7;
        hash = 14*hash+this.wartosc;
        return hash;
    }

    @Override
    public int compareTo(Object o) {
        return wartosc - ((Element)o).wartosc;
    }

    public Element(int wartosc,String opis)
    {
        this.wartosc = wartosc;
        this.opis = opis;
    }
    public String getOpis()
    {
        return opis;
    }
}
