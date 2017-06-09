import java.util.*;
import java.io.*;

public class Battleship
{
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
}