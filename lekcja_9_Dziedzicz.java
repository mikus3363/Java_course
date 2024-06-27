package kursJava;

public class lekcja_9_Dziedzicz {
    public static void main(String[] args) {

        //potwor demon = new potwor(25,100); Nie można w klasie abstrakcyjnej

        szkielet szkielet1 = new szkielet(30,70,"Łuk");
        System.out.println(szkielet1.speed);

        zombie zombie1 = new zombie(20,150);
        System.out.println(zombie1.speed);

        szkielet1.atak();

    }
}
