/*
 * 2D arrays in java where the inner arrays are not of same length.
 */
class JaggedArray {
    public static void main(String[] args) {
        int[][] p = {{5,6,7,8},{6,7},{9,8,7}};

        // How to define jagged array
        int[][] k = new int[3][];
        k[0] = new int[4];
        k[1] = new int[2];
        k[2] = new int[3];

        for (int[] x : k) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
