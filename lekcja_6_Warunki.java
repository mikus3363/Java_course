package kursJava;

public class lekcja_6_Warunki {
    public static void main(String[] args) {
        int a=5,
            b=7;
        System.out.println(a!=b);
        if(a>b)
            System.out.println("a>b");
        else if(a<b)
            System.out.println("a<b");
        else
            System.out.println("a=b");
    }
}