public class TorusGameOfLife extends GameOfLife {

    //• Attributes: o None: all are inherited from GameOfLife • Constructors: o All constructors defined as for GameOfLife
    // • neighbors: o Re-implement this method at the TorusGameOfLife level since it is the
    // only difference between a flat-board game of life and a torus game of life.
    public TorusGameOfLife(){}

    public TorusGameOfLife(int size){
        this.size = size;
        board = new int[size][size];
        previous = new int[size][size];
    }
    public TorusGameOfLife(int[][] gameBoard){
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
    @Override
    public int numOfNeighbors(int row, int col) {
        //use modulus
        int neighbors = 0;
        int size2 = previous[0].length;
        //up
        if(previous[(row - 1 + size) % size][col] == 1){
            neighbors++;
        }
        //down
        if(previous[(row + 1) % size][col] == 1){
            neighbors++;
        }
        //right
        if(previous[row][(col + 1) % size2] == 1){
            neighbors++;
        }
        //left
        if(previous[row][(col - 1 + size2) % size2] == 1){
            neighbors++;
        }
        //upright
        if(previous[(row - 1 + size) % size][(col + 1) % size2] == 1){
            neighbors++;
        }
        //upleft
        if(previous[(row - 1 + size) % size][(col - 1 + size2) % size2] == 1){
            neighbors++;
        }
        //downright
        if(previous[(row + 1) % size][(col + 1) % size2] == 1){
            neighbors++;
        }
        //downleft
        if(previous[(row + 1) % size][(col - 1 + size2) % size2] == 1){
            neighbors++;
        }
        return neighbors;
    }
}
