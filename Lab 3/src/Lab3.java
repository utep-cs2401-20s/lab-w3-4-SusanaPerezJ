import java.util.Arrays;

public class Lab3 {
    public static void main(String[] args) {
         /*int[][] solutionBoard4 = {{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},{0,0,0,1,0,0,0,1,0,0,0},{0,0,0,1,0,0,0,1,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0}, {0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,1,0,0,0,1,0,0,0},{0,0,0,1,0,0,0,1,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0}};
        //Neighbors method
        int[][] board4 = {{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0}, {0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0}, {0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,1,0,1,0,1,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0}};
        GameOfLife game = new GameOfLife(board4);
        game.oneStep();
        game.evolution(1);

        int size = 3;
        int size2 = 3;
        int col = 0;
        int row = 0;
        System.out.println("right: " + (col + 1) % size2);
        System.out.println("left: " + (col - 1 + size2) % size2);
        System.out.println("up: " + (row - 1 + size) % size);
        System.out.println("down: " + (row + 1) % size);
        String str = ("upright: " + ((row - 1 + size) % size)) + " " + ((col + 1) % size2);
        System.out.println(str);
        String str3 = ("downright: " + ((row + 1) % size)) + " " + ((col + 1) % size2);
        System.out.println(str3);
        String str2 = ("upleft: " + (row - 1 + size) % size) + (col - 1 + size2) % size2;
        System.out.println(str2);
        String str4 = ("downleft: " + (row + 1) % size) + (col - 1 + size2) % size2;
        System.out.println(str4);*/
         int[][] board5 = {{1,1,1}, {1,1,1},{1,1,1}};
         int[][] solutionBoard5 = {{0,0,0},{0,0,0},{0,0,0}};
        GameOfLife game = new GameOfLife(board5);
        game.printGameOfLife(board5);
        game.oneStep();
        game.printGameOfLife(game.getBoard());
    }
}
