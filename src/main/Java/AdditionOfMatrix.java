import java.util.Scanner;

public class AdditionOfMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int columns = sc.nextInt();

        int[][] matA = new int[rows][columns];
        int[][] matB = new int[rows][columns];

        System.out.println("Enter the elements of first matrix");

        for (int i = 0; i < rows; i++) {

            System.out.println("Enter the elements of row" + i);

            for (int j = 0; j < columns; j++) {

                matA[i][j] = sc.nextInt();

            }
        }

        System.out.println("Enter the elements of second matrix");
        for (int i = 0; i < rows; i++) {

            System.out.println("Enter the elements of row" + i);

            for (int j = 0; j < columns; j++) {

                matB[i][j] = sc.nextInt();
            }
        }

        AdditionOfMatrix obj = new AdditionOfMatrix();
        System.out.println("Sum of two matrices are");
      System.out.println(obj.sumOfMatrix(rows,columns,matA,matB));

    }

public static int[][] sumOfMatrix(int a,int b,int[][] c,int[][] d) {

    int[][] result = new int[a][b];
//    for(int j=0;j<d.length;)

    if (c.length != d.length) {
        return null;


    } else {
        String s = "";

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                result[i][j] = c[i][j] + d[i][j];
                s = s + result[i][j];

            }

        }
        System.out.println(s + " ");


        return result;
    }
}

}
