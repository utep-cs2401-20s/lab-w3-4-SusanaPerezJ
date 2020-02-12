import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GOLTest {
    //put arrays here
    public static int[][] board1 = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
    public static int[][] board2 = {{0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,1,1,1,0,0}, {0,0,1,1,1,0},{0,0,0,0,0,0}, {0,0,0,0,0,0}};
    public static int[][] board3 = {{0,0,0,0,0,0}, {0,1,1,0,0,0}, {0,1,1,0,0,0}, {0,0,0,1,1,0},{0,0,0,1,1,0}, {0,0,0,0,0,0}};

    @Test
    public void testNeighbors() {
        GameOfLife board1 = new GameOfLife();
        Assert.assertEquals(0, board1.numOfNeighbors(0, 0));

    }
}