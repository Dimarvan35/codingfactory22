package gr.aueb.cf.ch6;

/**
 * Δυσδιάστατος πίνακας
 */
public class TwoDimArray {
    public static void main(String[] args) {
       //Δήλωση και αρχικοποίηση.
        int[][] grid2 = new int[2][2];
        int[][] grid = {{0,1},
                        {2,3}};

//        grid [0][0] = 0;
//        grid [0][1] = 1;
//        grid [1][0] = 2;
//        grid [1][1] = 3;

        //Εκτύπωση
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //Enhanced for
        for (int[] row : grid) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();

        }


    }
}
