/**
 * Can use Varargs (Variable Arguments) to reduce the number of methods
 * that you need to create by allowing for more flexible parameters.
 */

class VarArgs {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.show(5);
    }
}

class Display {
    public void show(int ... a) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    // Java will give priority to this first then the varargs parameter
    public void show(int a) {
        System.out.println(a);
    }
}