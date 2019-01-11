import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

    public class CountOccurence{

        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the string");
            String str=scan.nextLine();
            System.out.println("enter the character you want to count occurence");
            String c=scan.nextLine();

            CountOccurence obj = new CountOccurence();


            System.out.println("number of "+c+" are "+obj.CountNumberOfTimes(str,c));


        }

        public static int CountNumberOfTimes(String a,String b){


            String small= a.replaceAll(b,"");

            int count=a.length()-small.length();

            return count;

        }

    }
