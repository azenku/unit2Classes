import java.util.Scanner;
import java.lang.Math;

public class Rectangle
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Give me a number for the height:  ");
        double height = scan.nextDouble();
        System.out.print("Give me a number for the width:  ");
        double width = scan.nextDouble();
        double height1 = height * height;
        double width1 = width * width;
        double diag = height1 + width1;
        double diag1 = Math.sqrt(diag);
        double area = height * width;
        double per = height + height + width + width;
        System.out.println("diagnal: " + diag1);
        System.out.println("area: " + area);
        System.out.println("perimiter: " + per);
    }
}
