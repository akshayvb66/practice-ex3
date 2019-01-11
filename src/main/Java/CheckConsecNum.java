import java.util.Scanner;

public class CheckConsecNum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] Nums = new int[7];

        System.out.println("enter the 7 numbers");

        for (int i = 0; i < 7; i++) {

            Nums[i] = scan.nextInt();
        }

        CheckConsecNum obj = new CheckConsecNum();

        System.out.println(obj.ConsecNumbers(Nums));

    }

    public String ConsecNumbers(int[] a) {

        String s="";

        for (int i = 0; i < 7; i++) {

        if(i>=1) {

            if (a[i] - a[i - 1] == 1 || a[i] - a[i - 2] == -2) {

                s = "true";
                continue;

            } else
                s = "false";
            break;
        }

        else {

            if (a[i] - a[i + 1] == 1 || a[i] - a[i + 1] == -1) {

                s = "true";
                continue;

            } else
                s="false";
                break;
        }
        }

return s;

    }
}