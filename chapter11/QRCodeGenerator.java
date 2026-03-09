/* MUST DOWNLOAD FILES FROM 11.4 Telusko Tutorials*/
//import java.io.ByteArrayOutputStream;
//import java.io.File;
//import java.io.FileOutputStream;
//
//import net.glxn.qrgen.QRCode;
//import net.glxn.qrgen.image.ImageType;
//
//class QRCodeGenerator {
//    public static void main(String[] args) throws Exception {
//        String details = "Shasank Patel - Channel Name : CorruptCookie";
//
//        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.PNG).stream();
//
//        File f = new File("/Users/shasankpatel/Downloads/MyChannel.png");
//
//        // Can be done using try with resource!
////        FileOutputStream fos = new FileOutputStream(f);
////        fos.write(out.toByteArray());
////        fos.flush();
//
//        try (FileOutputStream fos = new FileOutputStream(f)) {
//            fos.write(out.toByteArray());
//        }
//
//    }
//}
