import java.util.Scanner;

public class RemoveVowels {


    public static void main(String[] args) {

        RemoveVowels obj = new RemoveVowels();

        System.out.println("How many places do you want to enter");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt()+1;

        System.out.println("Enter the places");

        String[] places= new String[num];
        for (int j = 0;j<num;j++) {
            places[j] = sc.nextLine();
        }

        obj.vowelsRemove(num,places);

    }


    public static String[]  vowelsRemove(int a , String[] b){

        String[] removed = new String[a];


        for(int i=0;i<a;i++){

            b[i]=b[i].replaceAll("[aeiou]","");

            System.out.println(b[i]);

            removed[i]=b[i];
        }

        return removed;
    }
}
