import java.util.Arrays;

public class Lab3 {
    public static void main(String[] args) {
//        int[][] firstBoard = new int[5][5];
//        firstBoard[2][1] = 1;
//        firstBoard[2][2] = 1;
//        firstBoard[2][3] = 1;
//        GameOfLife game1 = new GameOfLife(firstBoard);
//        game1.printGameOfLife(firstBoard);
//        //game1.printArray(firstBoard);
//        //game1.numOfNeighbors(2,1);
//        game1.evolution(1);

        ////
        /*int[][] firstBoard = new int[6][6];
        firstBoard[2][2] = 1;
        firstBoard[2][3] = 1;
        firstBoard[3][3] = 1;
        firstBoard[3][1] = 1;
        firstBoard[3][2] = 1;
        firstBoard[2][4] = 1;
        int[][] firstBoard = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
        GameOfLife game1 = new GameOfLife(firstBoard);
        //game1.printGameOfLife(firstBoard);
        System.out.println(game1.numOfNeighbors(2,2));
        //game1.evolution(5);
        /*for(int i = 0; i < firstBoard.length; i++){
            for(int j = 0; j < firstBoard[i].length; j++) {
                System.out.println("Coordinates: " + i + ", " + j);
                System.out.println(game1.numOfNeighbors(i, j));
            }
        }
        System.out.println(game1.numOfNeighbors(1,0));
        System.out.println(game1.numOfNeighbors(2,0));
        System.out.println(game1.numOfNeighbors(3,0));
        System.out.println(game1.numOfNeighbors(4,0));
        System.out.println(game1.numOfNeighbors(1,5));
        System.out.println(game1.numOfNeighbors(2,5));
        System.out.println(game1.numOfNeighbors(3,5));
        System.out.println(game1.numOfNeighbors(4,5));*/
        //int[][] board2 = {{0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,1,1,1,0,0}, {0,0,1,1,1,0},{0,0,0,0,0,0}, {0,0,0,0,0,0}};
         /*int[][] board2 = {{1,1,1}, {1,1,0},{0,0,0}};
        GameOfLife game2 = new GameOfLife(board2);
        game2.printGameOfLife(board2);
        game2.evolution(1);
        System.out.println(game2.numOfNeighbors(0,0));
        System.out.println(game2.numOfNeighbors(0,1));
        System.out.println(game2.numOfNeighbors(0,2));
        System.out.println(game2.numOfNeighbors(1,0));
        System.out.println(game2.numOfNeighbors(1,1));
        System.out.println(game2.numOfNeighbors(1,2));
        System.out.println(game2.numOfNeighbors(2,0));
        System.out.println(game2.numOfNeighbors(2,1));
        System.out.println(game2.numOfNeighbors(2,2));*/
        int[][] board4 = {{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0}};
        //GameOfLife game2 = new GameOfLife(board4);
        //game2.printGameOfLife(board4);
        //game2.evolution(1);

            for(int[] row : board4){
                System.out.println(Arrays.toString(row));
            }
            System.out.println();



    }
}
