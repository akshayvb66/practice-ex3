public class ChessBoard {

    public static void main(String[] args) {

        System.out.println("My ChessBoard");

        ChessBoard obj = new ChessBoard();

        System.out.println(obj.printBoard(8, 8));

    }

    public static String printBoard(int rows, int columns) {
        String str = "WW|";
        String board = "";

        for (int i = 1; i <= rows; i++) {

            if ((i % 2) != 0) {
                for (int j = 0; j < 4; j++) {
                    if(j<3)
                    board = board + "WW|BB|";
                    else
                    board = board + "WW|BB|\n";

                }
            } else {
                for (int j = 0; j < 4; j++) {
                    if(j<3)
                        board = board + "BB|WW|";
                    else
                        board = board + "BB|WW|\n";

                }
            }

        }


        return board;

    }
}