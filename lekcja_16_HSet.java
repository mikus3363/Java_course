package kursJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class lekcja_16_HSet {
    public static void main(String[] args) {

        long mili = 0;
        long totalmili = 0;

        Set<String> set = new HashSet<String>(512); //nie ma uporządkowanych elementów
        set = new TreeSet<String>();// dane uporządkowane

        try{
            Scanner reader = new Scanner(new BufferedReader(new FileReader("nascan1")));

            while(reader.hasNext()) {
                mili = System.currentTimeMillis();
                set.add(reader.next());
                totalmili += (System.currentTimeMillis() - mili);
            }
            reader.close();
            Iterator<String> iter = set.iterator();
            while(iter.hasNext()){
                System.out.println(iter.next());
            }

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("czas wykonania : "+totalmili+"ms");
        System.out.println("wielkosc zbioru : "+set.size());
    }
}
