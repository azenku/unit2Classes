public class Phone
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Give me a 10 digit phone number: ");
        String number = scan.next();
        number = number.replace(",","");
        System.out.println(number);
    }
}
