package kursJava;

public class lekcja_6_switch {
    public static void main(String[] args) {
        int a=50;// można:int,char  nie można:double,string
        switch(a)
        {
            case 50:
                System.out.println("a to 50");
                break;
            case 100:
                System.out.println("a to 100");
                break;
            default:
                System.out.println("a to nie 50 ani 100");
        }
    }
}
