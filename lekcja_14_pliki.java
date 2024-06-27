package kursJava;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class lekcja_14_pliki {
    public static void main(String[] args) {
        try{
            File plik = new File("test.txt"); //wejscie
            
            if (!plik.exists()) { //jezeli nie istnieje
                plik.createNewFile();// zrob go
            }    
            System.out.println("Czy moge pisac?"+plik.canWrite());// czy moge canWrite
            System.out.println("Czy moge odpalic?"+plik.canExecute());// czy moge canExecute
            System.out.println("Czy moge czytac?"+plik.canRead());// czy moge canRead
            System.out.println("Czy jest ukryty?"+plik.isHidden());// czy jest Hidden
            System.out.println("Czy jest plikiem?"+plik.isFile());// czy jest plikiem, moze katalog
            System.out.println("Ostatnia modyfikacja :"+new Date(plik.lastModified()));// modyfikacja w
            System.out.println("Dlugosc plikow w bitach :"+plik.length());// ilosc znakow
            
            //plik.delete();
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
