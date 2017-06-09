import java.util.*;
import java.io.*;

public class Battleship
{
    public final static int EMPTY = 0; 
    public final static int EMPTY_HIT = 2; 
    public final static int OCCUPIED = 3; 
    public final static int OCCUPIED_HIT = 4; 
    public static Random rand = new Random();

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int[][] board = new int[5][5];
        populateBoard(board);

        Syste,.out.println("Hello!")
		System.out.println("Lets play a game of Battleship!");
        System.out.println("Play by entering the x and y coordinates by \"x,y\"");

        boolean won = false;
        do 
		{
            System.out.println("Attack Coordinates:");
            String attemptString = kb.nextLine();

            String[] splitAttemptString = attemptString.split(",");

            int attemptX = Integer.parseInt(splitAttemptString[0]);
            int attemptY = Integer.parseInt(splitAttemptString[1]);

            boolean fi = fireAt(board, attemptX, attemptY);
            if (fi) 
			{
                System.out.println("HIT");
            } 
			else 
			{
                System.out.println("MISS");
            }

            System.out.println("Board state:");
            String[][] sBoard = boardState(board);

            for (int i = 0; i < sBoard.length; i++) 
			{
                String thing = "";
                for (int j = 0; j < sBoard[i].length; j++) 
				{
                    thing += sBoard[i][j];
                }

                System.out.println(thing);
            }

            boolean occupied = false;
            for (int i = 0; i < board.length; i++) 
			{
                for (int j = 0; j < board[i].length; j++) 
				{
                    if (board[i][j] == OCCUPIED) 
					{
                        occupied = true;
                    }
                }
            }

            if ( ! occupied) 
			{
                won = true;
            }
        } while ( ! won);

        System.out.println("Congrats!!! You won");
    }

    public static String[][] boardState(int[][] board) 
	{
        String[][] bo = new String[5][5];

        for (int i = 0; i < board.length; i++) 
		{
            for (int j = 0; j < board[i].length; j++) 
			{
                if (board[i][j] == EMPTY_HIT) 
				{
                    bo[i][j] = "X";
                } else if (board[i][j] == OCCUPIED_HIT) 
				{
                    bo[i][j] = "O";
                } else {
                    bo[i][j] = "-";
                }
            }
        }

        return bo;
    }

    public static boolean fireAt(int[][] board, int x, int y) 
	{
        if (board[y][x] == OCCUPIED) 
		{
            board[y][x] = OCCUPIED_HIT;
            return true;
        }

        board[y][x] = EMPTY_HIT;
        return false;
    }

    public static void populateBoard(int[][] board) 
	{
        int[] usedY = new int[3];

        int bigShipY = generateNotTheSameNumber(usedY, 0);
        populateRow(board, bigShipY, 4);

        int medShipY = generateNotTheSameNumber(usedY, 1);
        populateRow(board, medShipY, 3);

        int smallShipY = generateNotTheSameNumber(usedY, 2);
        populateRow(board, smallShipY, 2);

    }

    public static void populateRow(int[][] board, int row, int size) 
	{
        System.out.println(row);
        for (int i = 0; i < size; i++) 
		{
            board[row][i] = OCCUPIED;
        }
    }

    public static int generateNotTheSameNumber(int[] store, int itera) 
	{
        int randInt;
        do 
		{
            randInt = rand.nextInt(4) + 1;
        } while (Arrays.asList(store).contains(randInt));

        store[itera] = randInt;
        return randInt;
    }
}