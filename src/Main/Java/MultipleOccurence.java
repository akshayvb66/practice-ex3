import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class MultipleOccurence {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scan.nextLine();
        System.out.println("enter the word you want to count number occurence");
        String c = scan.nextLine();

        MultipleOccurence obj = new MultipleOccurence();

        System.out.println(obj.countMultiple(str, c));


    }

    public static String countMultiple(String a, String b) {


        String s="";

        Pattern r = Pattern.compile(b);

        int count = 0;
        Matcher matcher = r.matcher(a);
        while (matcher.find()) {
          {
              count++;

               s =s+ "Found at " + matcher.start()+"-"+matcher.end()+"\n";


            }

        }
        return s;

    }

}

