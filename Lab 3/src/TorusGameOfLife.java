public class TorusGameOfLife extends GameOfLife {
    //• Attributes: o None: all are inherited from GameOfLife • Constructors: o All constructors defined as for GameOfLife
    // • neighbors: o Re-implement this method at the TorusGameOfLife level since it is the
    // only difference between a flat-board game of life and a torus game of life.
    public TorusGameOfLife(int size){
        this.size = size;

    }
    public TorusGameOfLife(int[][] board){
        int row = size;
        int col = size;
        board = new int[row][col];

    }
    @Override
    public int numOfNeighbors(int row, int col){
        //use modulus
        int neighbors = 0;
        return neighbors;
    }

}
