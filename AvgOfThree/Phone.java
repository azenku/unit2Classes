import java.util.Scanner;
import java.lang.Math;

public class Phone
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Give me a 10 digit phone number: ");
        String number = scan.next();
        String part1 = number.substring(0,3);
        String part11 = "(" + part1 + ") ";
        String part2 = number.substring(3,6);
        String part22 = part2 + "-";
        String part3 = number.substring(6,10);
        String part33 = part3;
        
        String finish = part11+part22+part33; 
        System.out.println(finish);
    }
}
