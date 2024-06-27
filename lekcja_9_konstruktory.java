package kursJava;

public class lekcja_9_konstruktory {
    public static void main(String[] args) {
        
        new Punkt();

        Punkt p = new Punkt(10,15);
        Punkt p2 = new Punkt(20,100);
        System.out.println("p.x "+p.x);
        System.out.println("p.y "+p.y);

        System.out.println("p2.x "+p2.x);
        System.out.println("p2.y "+p2.y);
    }
}

class Punkt{

    Punkt(){
        System.out.println("Wywołano domyślnie");
    }
    Punkt(int x,int y){
        System.out.println("Wywołano domyślnie z dwoma");
        this.x = x; //ten obiekt x podany wyzej x this
        this.y = y;
    }
    int x;
    int y;
}
