import java.io.*;
import java.util.Properties;

// How to deal with properties files
// A property file will have key:value pairs
class PropertiesFile {
    public static void main(String[] args) throws Exception {
        // Properties is an in built class in java
        Properties p = new Properties();
        File f = new File("dataConfig.properties");

//        // Store Properties
//        OutputStream os = new FileOutputStream(f);
//
//        p.setProperty("url", "localhost:3306/myDb");
//        p.setProperty("uname", "shasank");
//        p.setProperty("pass", "0000");
//        p.store(os, null);

        // Fetch Properties
        InputStream is = new FileInputStream(f);
        p.load(is);
//        System.out.println(p.getProperty("uname"));
//        System.out.println(p.getProperty("pass"));
//        System.out.println(p.getProperty("url"));
        p.list(System.out);     // Will list all properties
    }
}
