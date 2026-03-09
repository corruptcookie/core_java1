import java.io.*;

/*
    Serialization
        The process of storing an object's state.
        When saving data we do not store the object itself, we store the values.
 */
class SerialDemo {
    public static void main(String[] args) throws Exception {
        Save obj = new Save();
        obj.i = 4;

        File f = new File("obj.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Save obj1 = (Save) ois.readObject();

        System.out.println("Value of obj1 is " + obj1.i);
    }
}

class Save implements Serializable {    // Marker Interface
    int i;
}