public class ThisDemo {
    public static void main(String[] args) {
        G obj = new G(6);
        obj.show();
    }
}

class G {
    private int x;  // Instance

    public G(int x) {   // Local
        // Value of instance x will be zero as we are assigning local x to local x
        // x = x;

        this.x = x;     // Current Instance
    }

    public void show() {
        System.out.println("x is " + x);
    }
}