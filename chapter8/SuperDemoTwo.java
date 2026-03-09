public class SuperDemoTwo {
    public static void main(String[] args) {
        BBB obj = new BBB();
        obj.abc();
    }
}

class AAA {
    int i = 5;  // BBB class will use this variable if not defined in BBB

    public void abc() {
        System.out.println("A abc");
    }
}

class BBB extends AAA {
    int i = 4;  // Will use this first if exists

    public void show() {
        System.out.println(super.i);    // Can use super.i to call i from AAA
    }

    @Override
    public void abc() {
        super.abc();    // Will call abc of AAA as well
        System.out.println("B abc");
    }
}