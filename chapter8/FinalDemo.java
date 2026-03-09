// Final variable, method, class
public class FinalDemo {
    public static void main(String[] args) {
        final int i = 5;    // final keyword will prevent any changes
        // i++;  // We want to stop someone from changing this variable

        // Not necessary to assign immediately but once assigned cannot be changed
        final int j;
        j = 6;
        // j = 7;  // Cannot be done
        System.out.println(i);
        System.out.println(j);
    }
}

final class E {     // Cannot be inherited or extended by another class
    final public void show() {      // Once made final cannot be overridden
        System.out.println("In E show");
    }
}

class F /* extends E */ {
//    @Override
//    public void show() {
//        System.out.println("In F show");
//    }


}