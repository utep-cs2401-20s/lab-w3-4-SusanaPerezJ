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
        size = gameBoard.length;
        //for non squared boards
        int size2 = gameBoard[0].length;
        previous = new int[size][size2];
        board = new int[size][size2];
        for(int i = 0; i < previous.length; i++){
            for(int j = 0; j< previous[i].length; j++) {
                previous[i][j] = gameBoard[i][j];
            }
        }
    }
    public int[][] getBoard() {
        return previous;
    }
    public void oneStep(){
        //transform current board into next shape
        int size2 = previous[0].length;
        //rules
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size2; j++) {
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
                if (previous[i][j] == 0) {
                    //check other rules and apply to board;
                    if (numOfNeighbors(i , j) == 3) {
                        board[i][j] = 1;
                    }
                }
            }
        }
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size2; j++){
                previous[i][j] = board[i][j];
            }
        }
    }
    //I got help from Antoine for this method
    public int numOfNeighbors(int row, int col){
        int neighbors = 0;
        int size2 = previous[0].length;
        //rows
        if(row - 1 >= 0){
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
        if(col - 1 >= 0){
            //left
            if(previous[row][col-1] == 1){
                neighbors++;
            }
        }
        if(col + 1 < size2){
            //right
            if(previous[row][col+1]==1){
                neighbors++;
            }
        }
        //diagonals
        if(row - 1 >= 0 && col -1 >= 0){
            //up left
            if(previous[row-1][col-1]==1){
                neighbors++;
            }
        }
        if(row - 1 >= 0 && col + 1 < size2){
            //up right
            if(previous[row-1][col+1]==1){
                neighbors++;
            }
        }
        if(row + 1 < size && col -1 >= 0){
            //down left
            if(previous[row+1][col-1]==1){
                neighbors++;
            }
        }
        if(row + 1 < size && col + 1 < size2){
            //down right
            if(previous[row+1][col+1]==1){
                neighbors++;
            }
        }
        return neighbors;
    }
    public int[][] evolution(int n){
        // Transforms the board into the board after n steps of evolution (i.e., n successive calls to oneStep).
        while(n > 0){
            oneStep();
            n--;
        }
        return board;
    }
    public void printGameOfLife(int[][] boardToPrint){
        for(int[] row : boardToPrint){
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
