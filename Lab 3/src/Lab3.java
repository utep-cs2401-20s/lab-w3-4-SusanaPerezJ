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
        int[][] firstBoard = new int[6][6];
        firstBoard[2][2] = 1;
        firstBoard[2][3] = 1;
        firstBoard[3][3] = 1;
        firstBoard[3][1] = 1;
        firstBoard[3][2] = 1;
        firstBoard[2][4] = 1;
        GameOfLife game1 = new GameOfLife(firstBoard);
        game1.printGameOfLife(firstBoard);
        game1.numOfNeighbors(2,1);
        game1.evolution(2);
        /*for(int i = 0; i < firstBoard.length; i++){
            for(int j = 0; j < firstBoard[i].length; j++) {
                System.out.println("Coordenates: " + i + ", " + j);
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

    }
}
