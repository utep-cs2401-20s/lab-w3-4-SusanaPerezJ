import java.util.Arrays;
import java.util.*;

public class GameOfLife {
     int size; //not private nor public
     int[][] board;
     int[][] previous;

    public GameOfLife(){}

    public GameOfLife(int size){
        this.size = size;
        board = new int[size][size];
        previous = new int[size][size];
    }
    public GameOfLife(int[][] gameBoard){
        //copy from boardGame to previous
        this.size = gameBoard.length;
        board = new int[size][size];
        previous = new int[size][size];
        for(int i = 0; i < previous.length; i++){
            for(int j = 0; j< previous[i].length; j++) {
                previous[i][j] = gameBoard[i][j];
            }
        }
        //size of a = a.length
        //board to size
        printGameOfLife(previous);

    }
    public int[][] getBoard() {
        return previous;
    }
    public void oneStep(){
        //transform current board into next shape
        //rules
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++) {
                //check live
                if (previous[i][j] == 1) {
                    //check other rules
                    if (numOfNeighbors(i, j) < 2 || numOfNeighbors(i, j) > 3) {
                        board[i][j] = 0;
                    } else if (numOfNeighbors(i, j) == 2 || numOfNeighbors(i, j) == 3) {
                        //cell lives
                        board[i][j] = 1;
                    }
                }
                //check dead
                if (previous[i][j] == 0) {
                    //check other rules and apply to board;
                    if (numOfNeighbors(i , j) == 3) {
                        board[i][j] = 1;
                    }
                }
            }
        }
    }

    //I got help from Antoine for this method
    public int numOfNeighbors(int row, int col){
        int neighbors = 0;
        //rows
        if(row - 1 > 0){
            //up
            if(previous[row-1][col] == 1){
                neighbors++;
            }
        }
        if(row + 1 < size){
            //down
            if(previous[row+1][col] == 1){
                neighbors++;
            }
        }
        //columns
        if(col - 1 > 0){
            //left
            if(previous[row][col-1] == 1){
                neighbors++;
            }
        }
        if(col + 1 < size){
            //right
            if(previous[row][col+1]==1){
                neighbors++;
            }
        }
        //diagonals
        if(row - 1 > 0 && col -1 > 0){
            //up left
            if(previous[row-1][col-1]==1){
                neighbors++;
            }
        }
        if(row - 1 > 0 && col + 1 < size){
            //up rigth
            if(previous[row-1][col+1]==1){
                neighbors++;
            }
        }
        if(row + 1 < size && col -1 > 0){
            //down left
            if(previous[row+1][col-1]==1){
                neighbors++;
            }
        }
        if(row + 1 < size && col + 1 < size){
            //down rigth
            if(previous[row+1][col+1]==1){
                neighbors++;
            }
        }
        return neighbors;
    }
    public int[][] evolution(int n){
        // o Transforms the board into the board after n steps of evolution (i.e., n successive calls to oneStep).
        for(int i = n; i > 0; i--){
            //code here
            oneStep();
        }
        printGameOfLife(board);
        return board;
    }
    public void printGameOfLife(int[][] boardToPrint){
        for(int[] row : boardToPrint){
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
