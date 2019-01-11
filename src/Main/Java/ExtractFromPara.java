import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ExtractFromPara {


        public static void main(String[] args) throws IOException {

            System.out.println("Please enter your paragraph");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();

            ExtractFromPara obj= new ExtractFromPara();

            System.out.println("words sorted according to alphabets are");
            System.out.println(sortWords(input));

        }


        public static String sortWords(String a){

            String sorted = "" ;

            String[] words = a.split(" ");

            Arrays.sort(words);


            for (int i=0;i<words.length;i++){
                sorted += words[i] + " ";

            }

            return sorted;
        }
    }


