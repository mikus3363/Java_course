package kursJava;

public class lekcja_6_zad {
    public static void main(String[] args) {
        int wiek=14;
        if(wiek>=0){
            if(wiek<15){
                System.out.println("Musisz sie uczyc");
            }  
            else if(wiek>=18 && wiek<65){
                System.out.println("Możesz isc do pracy");
            }
            else if(wiek>=65){
                System.out.println("Możesz isc na emeryture");
            }  
            else
                System.out.println("Nie możesz pracować");
        }
        else{
            System.out.println("Niepoprawny wiek");
        }  
    }
}
