import java.util.Scanner;

public class FindTheName {

    public static void main(String a[]){
        FindTheName obj = new FindTheName();
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the sentence");
        String s = scan.nextLine();

        System.out.println("Is Harry here? "+obj.findHarry(s));

    }

    public boolean findHarry(String input)
    {
        String inputString=input.toLowerCase();


        if(inputString==null)
        {
            return false;
        }
        else
        {
            if(inputString.matches(".*harry.*")) {
            return true;
            }
            else
            return false;
            }

    }



}