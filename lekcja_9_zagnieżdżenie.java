package kursJava;

public class lekcja_9_zagnieżdżenie {
    public static void main(String[] args) {
        A zewnetrzna = new A();//bez tego nie stworzymy klasy wewnętrznej
        A.B tmp = zewnetrzna.new B(); //stworzenie instancji klasy wewnętrznej B

        A.C tmp2 = new A.C(); //stworzenie instancji klasy wewnętrznej C tylko dlatego że jest statyczna
    }   
}

class A
{
    A()
    {
        System.out.println("Jestem z klasy zewnętrznej A");
    }
    class B
    {
        //static int u;//nie mozna stworzyc zmienne statyczne bo musiałaby na pewno istniec klasa A
        B()
        {
            System.out.println("Jestem z klasy zagnieżdżonej B");
        }
        void cos()
        {
            test = 5;//dostęp do klasy zewnętrznej
        }

        private int temp;
    }
    static class C
    {
        //static int p;//mozna stworzyc zmienne statyczne 
        C()
        {
            System.out.println("Jestem z klasy zagnieżdżonej C");
            //test = 6;//break dostępu do klasy zewnętrznej
        }
    }
    void cos2()
    {
        //temp = 5;//brak dostępu do klasy wewnętrznej
        B obj = new B();//można tworzyć objekty
    }
    private int test;

}