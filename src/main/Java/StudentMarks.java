import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of students");
        int NumOfStudents = sc.nextInt();
        System.out.println("enter the grades of each students");
        StudentMarks obj = new StudentMarks();
        int[] stuGrades = new int[NumOfStudents];


        for (int i = 0; i < NumOfStudents; i++) {

            stuGrades[i] = sc.nextInt();
        }

        System.out.println(obj.checksValidMarks(NumOfStudents, stuGrades));
    }

    public static String checksValidMarks(int a, int[] b) {

        String c="";

        for (int i = 0; i < a; i++) {

            if (b[i]< 0 || b[i]>100) {

                c = "grades of  are not valid";

                break;
            }
            else {

                c = "marks are valid";
            }

        }

        return c;

    }
}