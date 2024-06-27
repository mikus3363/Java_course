package kursJava;

import java.io.IOException;
import java.util.Scanner;

public class lekcja_9_bank {
    public static void main(String[] args) throws IOException {

        try (Scanner scan = new Scanner(System.in)) {
            Account account = new Account();
            int k=1;
            do {
                System.out.println("Witamy w banku Pączek");
                System.out.println("--------------------------");
                System.out.println("Proszę wybrać usługę :");
                System.out.println("1.Wpłata na konto");
                System.out.println("2.Wypłata z konta");
                System.out.println("3.Pokaż stan konta");
                System.out.println("4.Wychodzę");
                System.out.println("--------------------------");

                int x = scan.nextInt();
                switch (x) {
                    case 1:
                        System.out.println("Wprowadź kwotę do wpłaty: ");
                        double kasa = scan.nextDouble();
                        account.wpłata(kasa);
                        System.out.println("Pieniądze wpłacone");
                        break;
                    case 2:
                        System.out.println("Wprowadź kwotę do wypłaty: ");
                        double pobór = scan.nextDouble();
                        account.wypłata(pobór);
                        if(account.balance>=0) {
                            System.out.println("Pieniądze wypłacone");
                        }
                        break;
                    case 3:
                        System.out.println("Saldo konta: "+account.pokażstan());
                        break;
                    case 4:
                        System.out.println("Dziękujemy za usługi w banku");
                        k--;
                        break;
                    default:
                        break;
                } 
                System.out.println();
                System.out.println("Czy operacja przebiegła zgodnie z oczekiwaniami?");
                System.out.println("1.Tak");
                System.out.println("2.Nie");
                int spraw = scan.nextInt();
                switch (spraw) {
                    case 1:
                        System.out.print("\033[H\033[2J"); // cls
                        System.out.flush();                       
                        break;
                    case 2:
                        System.out.println("Dziękujemy za usługi w banku");
                        k--;
                        break;
                    default:
                        break;
                }    
            } while (k==1);
        }
    }
}
class Account
{
    protected double balance;

    public Account()
    {
        this.balance = 0;
    }
    public void wpłata(double kwota)
    {
        this.balance+=kwota;
    }
    public void wypłata(double kwota)
    {
        if(kwota<=this.balance){
            this.balance-=kwota;
        }
        else{
            System.out.println("Za mało środków na koncie");
        }
    }
    public double pokażstan(){
        return this.balance;
    }
}
