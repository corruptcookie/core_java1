import java.io.*;

/*
    Chapter 12 is about File Handling
 */
class FileDemo {
    public static void main(String[] args) throws Exception {
        // Write to file
        // Always good to have reference of file (can find path)
        File f = new File("demo.txt");
        // Needs File or file name that it will create (better to create file reference)
        FileOutputStream fos = new FileOutputStream(f);
        // Needs FileOutputStream
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Demo Content");

        // Same steps to read files
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);

    }
}
