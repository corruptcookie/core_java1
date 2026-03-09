class Array {
    public static void main(String[] args) {
        int[] a = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = i+1;
        }

        // Enhanced for loop
        for (int i : a) {
            System.out.println(i); // i is now the value
        }

        // Handle Exceptions
        try {
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println("Out of Bounds!");
        }
    }
}