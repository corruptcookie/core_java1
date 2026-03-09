class SuperDemo {
    public static void main(String[] args) {
        //BB obj = new BB();
        BB obj = new BB(5);
    }
}

class AA {      // Every class extends Object class
    public AA() {
        // super(); // By default in all constructors.
        System.out.println("In const A");
    }
    public AA(int i) {
        System.out.println("In const A para");
    }
}

class BB extends AA {
    public BB() {
        // super(); // By default calls AA
        System.out.println("In const B");
    }
    public BB(int i) {
        // super(); // By default calls A not A para
        super(i); // This will call A para
        System.out.println("In const B para");
    }
}
