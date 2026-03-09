class ArrayTwoD {
    public static void main(String[] args) {
//        int a=5,b=6,c=7,d=8;
        int[] x = {5,6,7,8};
        int[] y = {6,7,8,9};
        int[] z = {9,8,7,6};
        int[][] p = {x,y,z}; // Can also do {{5,6,7,8},{6,7,8,9},{9,8,7,6}}

        // Regular for loop
//        for (int i = 0; i < p.length; i++) {
//            for (int j = 0; j < p[0].length; j++) {
//                System.out.print(p[i][j] + " ");
//            }
//            System.out.println();
//        }

        //Enhanced for loop
        for (int[] ints : p) {
            for (int k : ints) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
