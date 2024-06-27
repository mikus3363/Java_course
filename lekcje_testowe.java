package kursJava;

import java.util.Scanner;

public class lekcje_testowe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swoje imię: ");
        String name = scan.nextLine();

        System.out.println("Twoje imię to: " + name);

    }
}
