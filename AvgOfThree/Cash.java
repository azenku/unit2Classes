import java.util.Scanner;
import java.lang.Math;

public class Cash
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Give me amount due: ");
        int number = scan.nextInt();
        System.out.print("Give me the money: ");
        int numbro = scan.nextInt();
        int change = numbro - number;
        int dollars = change / 100;
        change -= dollars*100;
        int quarters = change / 25;
        change -= quarters*25;
        int dimes = change / 10;
        change -= dimes*10;
        int nickles = change/5;
        change -= nickles*5;
        int pennies = change;
        System.out.println(dollars + " " + quarters + " " + dimes + " " + nickles + " " + pennies + " ");
        
        
        
    }
}
