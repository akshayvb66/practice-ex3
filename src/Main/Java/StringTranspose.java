import java.util.Scanner;

public class StringTranspose {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Pls input the string");

        String str = scan.nextLine();

        StringTranspose obj= new StringTranspose();

        System.out.println(obj.Transposed(str));

    }

    public static String Transposed(String s) {

        String[] s1 = s.split(" ");

        int num = s1.length;

        String reverseString = "";


        for (int i = 0; i < s1.length; i++) {
            String word = s1[i];

            String reverseWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }

            reverseString = reverseString + reverseWord + " ";
        }
        return reverseString;

    }
}
