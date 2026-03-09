/**
 * Anonymous object can be used to save space in the stack.
 * Garbage collection can get rid of anonymous object immediately after use
 * instead of having to wait until the reference is out of scope.
 * It is only stored in heap memory and can only be accessed once.
 */
class AnonymousObject {
    public static void main(String[] args) {
        int i = 5;  // i is Primitive type: only stored on stack (i | 5)
        System.out.println(i);
        // Reference Object obj -> H obj = new H();
        // Instance stored in heap memory and reference stored in stack memory

        /* Case 1
         * Better to use anonymous object (new H().show();) since we are only using
         * obj once.
         */
        H obj = new H();
        obj.show();
        new H().show();

        /* Case 2
         * Better to use reference object when accessing the instance more than once
         */
        H obj1 = new H();
        obj1.k = 10;
        obj1.show();    // This will print 10 correctly

        new H().k = 10;
        new H().show(); // This will print 0 as two different instances were created
    }
}

class H {
    int k;

    public void show() {
        System.out.println("k is " + k);
    }
}