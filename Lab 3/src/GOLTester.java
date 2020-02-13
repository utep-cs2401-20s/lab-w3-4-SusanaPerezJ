import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GOLTester {
    //put arrays here
    public static int[][] board1 = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
    public static int[][] board2 = {{0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,1,1,1,0,0}, {0,0,1,1,1,0},{0,0,0,0,0,0}, {0,0,0,0,0,0}};
    public static int[][] board3 = {{0,0,0,0,0,0}, {0,1,1,0,0,0}, {0,1,1,0,0,0}, {0,0,0,1,1,0},{0,0,0,1,1,0}, {0,0,0,0,0,0}};
    //11 x 18
    public static int[][] board4 = {{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,1,1,1,0,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},
            {0,0,0,0,1,1,1,0,0,0,0}, {0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0}, {0,0,0,0,1,1,1,0,0,0,0},
            {0,0,0,1,0,1,0,1,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},
            {0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0}};
    public static int[][] board5 = {{1,1,1}, {1,1,0},{0,0,0}};
    //Neighbors method
    @Test
    public void testNeighbors() {
        int[][] board1 = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
        GameOfLife game = new GameOfLife(board1);
        Assert.assertEquals(2, game.numOfNeighbors(2, 2));
    }
    @Test
    public void testNeighbors1() {
        int[][] board2 = {{0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,1,1,1,0,0}, {0,0,1,1,1,0},{0,0,0,0,0,0}, {0,0,0,0,0,0}};
        GameOfLife game = new GameOfLife(board2);
        Assert.assertEquals(1, game.numOfNeighbors(2,0));
    }
    @Test
    public void testNeighbors2() {
        int[][] board3 = {{0,0,0,0,0,0}, {0,1,1,0,0,0}, {0,1,1,0,0,0}, {0,0,0,1,1,0},{0,0,0,1,1,0}, {0,0,0,0,0,0}};
        GameOfLife game = new GameOfLife(board3);
        Assert.assertEquals(2, game.numOfNeighbors(1, 3));
    }
    @Test
    public void testNeighbors3() {
        int[][] board4 =
                {{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},
                {0,0,0,0,1,1,1,0,0,0,0}, {0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0}, {0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,1,0,1,0,1,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0}};
        GameOfLife game = new GameOfLife(board4);
        Assert.assertEquals(6, game.numOfNeighbors(5, 4));
    }
    @Test
    public void testNeighbors4() {
        int[][] board5 = {{1,1,1}, {1,1,0},{0,0,0}};
        GameOfLife game = new GameOfLife(board5);
        Assert.assertEquals(4, game.numOfNeighbors(0, 1));
    }
    //OneStep method
    @Test
    public void testOneStep(){
        GameOfLife game = new GameOfLife();
    }
    @Test
    public void testOneStep1(){
        GameOfLife game = new GameOfLife();
    }
    @Test
    public void testOneStep2(){
        GameOfLife game = new GameOfLife();
    }
    @Test
    public void testOneStep3(){
        GameOfLife game = new GameOfLife();
    }
    @Test
    public void testOneStep4(){
        GameOfLife game = new GameOfLife();
    }
    //evolution method
    @Test
    public void testEvolution(){
        GameOfLife game = new GameOfLife();

    }
    @Test
    public void testEvolution1(){
        GameOfLife game = new GameOfLife();

    }
    @Test
    public void testEvolution2(){
        GameOfLife game = new GameOfLife();

    }
    @Test
    public void testEvolution3(){
        GameOfLife game = new GameOfLife();

    }
    @Test
    public void testEvolution4(){
        GameOfLife game = new GameOfLife();

    }

}