import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        char currentPlayer = 'X';
        int moveCount = 0;

        while (true) {
            printBoard(board);
            System.out.println("Player " + currentPlayer + ", enter your move (1-9): ");
            int move = sc.nextInt() - 1;

            if (move < 0 || move > 8 || board[move] != ' ') {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            board[move] = currentPlayer;
            moveCount++;

            if (checkWinner(board, currentPlayer)) {
                printBoard(board);
                System.out.println("🎉 Player " + currentPlayer + " wins!");
                break;
            }

            if (moveCount == 9) {
                printBoard(board);
                System.out.println("It's a draw!");
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        sc.close();
    }

    static void printBoard(char[] b) {
        System.out.println();
        System.out.println(" " + b[0] + " | " + b[1] + " | " + b[2]);
        System.out.println("---+---+---");
        System.out.println(" " + b[3] + " | " + b[4] + " | " + b[5]);
        System.out.println("---+---+---");
        System.out.println(" " + b[6] + " | " + b[7] + " | " + b[8]);
        System.out.println();
    }

    static boolean checkWinner(char[] b, char p) {
        int[][] wins = {
            {0,1,2}, {3,4,5}, {6,7,8}, // rows
            {0,3,6}, {1,4,7}, {2,5,8}, // cols
            {0,4,8}, {2,4,6}           // diagonals
        };
        for (int[] line : wins) {
            if (b[line[0]] == p && b[line[1]] == p && b[line[2]] == p) {
                return true;
            }
        }
        return false;
    }
}
