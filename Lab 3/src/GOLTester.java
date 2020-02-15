import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class GOLTester {
    public int[][] board1 = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
    public int[][] board2 = {{0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,1,1,1,0,0}, {0,0,1,1,1,0},{0,0,0,0,0,0}, {0,0,0,0,0,0}};
    public int[][] board3 = {{0,0,0,0,0,0}, {0,1,1,0,0,0}, {0,1,1,0,0,0}, {0,0,0,1,1,0},{0,0,0,1,1,0}, {0,0,0,0,0,0}};
    public int[][] board4 = {{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,1,1,1,0,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},
            {0,0,0,0,1,1,1,0,0,0,0}, {0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0}, {0,0,0,0,1,1,1,0,0,0,0},
            {0,0,0,1,0,1,0,1,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},
            {0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0}};
    public int[][] board5 = {{1,1,1}, {1,1,1},{1,1,1}};
    public int[][] solutionBoard1 = {{0,0,0,0,0},{0,0,1,0,0},{0,0,1,0,0},{0,0,1,0,0},{0,0,0,0,0}};
    public int[][] solutionBoard2 = {{0,0,0,0,0,0},{0,0,1,0,0,0},{0,1,0,0,1,0},{0,1,0,0,1,0},{0,0,0,1,0,0},{0,0,0,0,0,0}};
    public int[][] solutionBoard3 = {{0, 0, 0, 0, 0, 0},{0, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 1, 1, 0}, {0, 0, 0, 0, 0, 0}};
    public int[][] solutionBoard4 = {{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0},{0,0,0,1,0,0,0,1,0,0,0},{0,0,0,1,0,0,0,1,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,1,1,1,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,1,1,1,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,1,0,0,0,1,0,0,0},{0,0,0,1,0,0,0,1,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,1,1,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0}};
    public int[][] solutionBoard5 = {{1,0,1},{0,0,0},{1,0,1}};
    public int[][] torusSolutionBoard5 = {{0,0,0},{0,0,0},{0,0,0}};
    //Neighbors method
    @Test
    public void testNeighbors() {
        GameOfLife game = new GameOfLife(board1);
        Assert.assertEquals(2, game.numOfNeighbors(2, 2));
    }
    @Test
    public void testNeighbors1() {
        GameOfLife game = new GameOfLife(board2);
        Assert.assertEquals(1, game.numOfNeighbors(2,0));
    }
    @Test
    public void testNeighbors2() {
        GameOfLife game = new GameOfLife(board3);
        Assert.assertEquals(2, game.numOfNeighbors(1, 3));
    }
    @Test
    public void testNeighbors3() {
        GameOfLife game = new GameOfLife(board4);
        Assert.assertEquals(6, game.numOfNeighbors(5, 4));
    }
    @Test
    public void testNeighbors4() {
        GameOfLife game = new GameOfLife(board5);
        Assert.assertEquals(4, game.numOfNeighbors(0, 1));
    }
    @Test
    public void testNeighbors5() {
        GameOfLife game = new GameOfLife(5);
        Assert.assertEquals(0, game.numOfNeighbors(0, 1));
    }
    //OneStep method
    @Test
    public void testOneStep(){
        GameOfLife game = new GameOfLife(board1);
        game.oneStep();
       assertArrayEquals(solutionBoard1, game.getBoard());

    }
    @Test
    public void testOneStep1(){
        GameOfLife game = new GameOfLife(board1);
        game.oneStep();
        assertArrayEquals(solutionBoard1, game.getBoard());
    }
    @Test
    public void testOneStep2(){
        GameOfLife game = new GameOfLife(board2);
        game.oneStep();
        assertArrayEquals(solutionBoard1, game.getBoard());
    }
    @Test
    public void testOneStep3(){
        GameOfLife game = new GameOfLife(board3);
        game.oneStep();
        assertArrayEquals(solutionBoard3, game.getBoard());
    }
    @Test
    public void testOneStep4(){
        GameOfLife game = new GameOfLife(board4);
        game.oneStep();
        assertArrayEquals(solutionBoard4, game.getBoard());
    }
    @Test
    public void testOneStep5(){
        GameOfLife game = new GameOfLife(board5);
        game.oneStep();
        assertArrayEquals(solutionBoard5, game.getBoard());
    }

    //evolution method
    @Test
    public void testEvolution(){
        GameOfLife game = new GameOfLife(board1);
        assertArrayEquals(solutionBoard1, game.evolution(1));
    }
    @Test
    public void testEvolution1(){
        GameOfLife game = new GameOfLife(board1);
        assertArrayEquals(board1, game.evolution(2));
    }
    @Test
    public void testEvolution2(){
        GameOfLife game = new GameOfLife(board2);
        assertArrayEquals(solutionBoard2, game.evolution(1));

    }
    @Test
    public void testEvolution3(){
        GameOfLife game = new GameOfLife(board3);
        assertArrayEquals(solutionBoard3, game.evolution(1));

    }
    @Test
    public void testEvolution4(){
        GameOfLife game = new GameOfLife(board4);
        assertArrayEquals(solutionBoard4, game.evolution(1));

    }

    ///TORUS GAME OF LIFE///
    @Test
    public void testNeighborsTorus() {
        TorusGameOfLife game = new TorusGameOfLife(board5);
        Assert.assertEquals(8, game.numOfNeighbors(0, 0));
    }
    @Test
    public void testNeighborsTorus1() {
        TorusGameOfLife game = new TorusGameOfLife(board1);
        Assert.assertEquals(2, game.numOfNeighbors(2, 2));
    }
    @Test
    public void testNeighborsTorus2() {
        TorusGameOfLife game = new TorusGameOfLife(board2);
        Assert.assertEquals(1, game.numOfNeighbors(2,5 ));
    }
    @Test
    public void testNeighborsTorus3() {
        TorusGameOfLife game = new TorusGameOfLife(board3);
        Assert.assertEquals(3, game.numOfNeighbors(4, 3));
    }
    @Test
    public void testNeighborsTorus4() {
        TorusGameOfLife game = new TorusGameOfLife(board4);
        Assert.assertEquals(0, game.numOfNeighbors(17, 5));
    }

    ///One Step
    @Test
    public void testOneStepTorus(){
        TorusGameOfLife game = new TorusGameOfLife(board1);
        game.oneStep();
        assertArrayEquals(solutionBoard1, game.getBoard());
    }
    @Test
    public void testOneStepTorus1(){
        TorusGameOfLife game = new TorusGameOfLife(board2);
        game.oneStep();
        assertArrayEquals(solutionBoard2, game.getBoard());
    }
    @Test
    public void testOneStepTorus2(){
        TorusGameOfLife game = new TorusGameOfLife(board3);
        game.oneStep();
        assertArrayEquals(solutionBoard3, game.getBoard());
    }
    @Test
    public void testOneStepTorus3(){
        TorusGameOfLife game = new TorusGameOfLife(board4);
        game.oneStep();
        assertArrayEquals(solutionBoard4, game.getBoard());
    }
    @Test
    public void testOneStepTorus4(){
        TorusGameOfLife game = new TorusGameOfLife(board5);
        game.oneStep();
        assertArrayEquals(torusSolutionBoard5, game.getBoard());
    }

    //evolution method
    @Test
    public void testEvolutionTorus(){
        TorusGameOfLife game = new TorusGameOfLife(board1);
        assertArrayEquals(solutionBoard1, game.evolution(1));
    }
    @Test
    public void testEvolutionTorus1(){
        TorusGameOfLife game = new TorusGameOfLife(board2);
        assertArrayEquals(solutionBoard2, game.evolution(1));
    }
    @Test
    public void testEvolutionTorus2(){
        TorusGameOfLife game = new TorusGameOfLife(board3);
        assertArrayEquals(solutionBoard3, game.evolution(1));
    }
    @Test
    public void testEvolutionTorus3(){
        TorusGameOfLife game = new TorusGameOfLife(board4);
        assertArrayEquals(solutionBoard4, game.evolution(1));
    }
    @Test
    public void testEvolutionTorus4(){
        int[][] solutionBoard4 = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        TorusGameOfLife game = new TorusGameOfLife(board4);
        assertArrayEquals(solutionBoard4, game.evolution(3));
    }

}