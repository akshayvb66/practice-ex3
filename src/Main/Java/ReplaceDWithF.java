import java.util.Scanner;

public class ReplaceDWithF {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your String");

        String str= scan.nextLine();

        ReplaceDWithF obj = new ReplaceDWithF();

        System.out.println(obj.ReplaceDandL(str));

    }

    public static String ReplaceDandL(String a){

        String s1= a.replaceAll("d","f");
        String s2= s1.replaceAll("l","t");

        return s2;

    }
}
