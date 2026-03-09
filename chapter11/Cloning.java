/*
    Shallow Copy
        Two references to the same object. If one object changes, so does the other.

    Deep Copy
        Manually creating a new object and copying over each value.
        Results in two independent copies.

    Cloning
        Using and Object method obj.clone() to automatically do the same as deep copy.
        However, clone is protected.
        Must implement marker interface Cloneable so class will allow.
        Must handle CloneNotSupportedException

 */
class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Abc obj = new Abc();
        obj.i = 5;
        obj.j = 6;

//        Abc obj1 = obj;     // Shallow copy (Whenever obj changes so does obj1)

//        // Deep Copy
//        Abc obj1 = new Abc();
//        obj1.i = obj.i;
//        obj1.j = obj.j;

        // Cloning
        Abc obj1 = (Abc) obj.clone();   // Must cast since return is type Object

        System.out.println(obj);
        System.out.println(obj1);
    }
}

class Abc implements Cloneable{
    int i=0, j=0;

    @Override
    public String toString() {
        return "Abc{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
