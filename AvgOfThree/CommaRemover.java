import java.util.Scanner;


public class CommaRemover
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Give me a number with a comma: ");
        String number = scan.next();
        number = number.replace(",","");
        System.out.println(number);
    }
}
