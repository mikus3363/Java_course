package kursJava;

//import java.util.concurrent.CountDownLatch;

public class zmienne {

    public static void main(String[] args) {
        //Typy :
        //int - 32 bity od -2^31 do 2^31
        //long - 64 bity od -2^63 do 2^63
        //byte - 8 bit od -128 do 127
        //short - 16 bit od -32,768 do 32,767
        //char - 2 bajt
        //String - ciąg znaków
        //float - 32 bity - od 1,4 * 10^-45 do  3,4 * 10^138
        //double - 64 bity - dokładniejsze od 4,9 * 10^-324 do 1,8 * 10^308
        int a = 10;
        int b = 5;
        int c;
        //char h = 'A';
        //byte g = 120;
        //long f = 1312312312L; // L na koncu ważne przy long
        String d = "Ala";
        String e = "Zosia";
        //float i = 4.57f; // f na koncu przy float
        //double j = 56.3123d; // d jest domyslnie
        c=a+b;
        System.out.println(c); // sout+tab
        System.out.println("imie: " + d + " nazwisko: " + e); //łączenie stringów
    }
}