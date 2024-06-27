package kursJava;

public class podziel {
    public static void main(String[] args) {
        int counter = 0;
        for(int i = 1;i<601;i++)
        {
            if(i%8==0 || i%12==0 || i%15==0)
            {
                System.out.println(i+",");
                counter++;
            }
        }
        System.out.println(counter);
    }

}
