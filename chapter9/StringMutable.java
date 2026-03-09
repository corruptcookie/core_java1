// StringBuffer and StringBuilder class to build mutable Strings
class StringMutable {
    public static void main(String[] args) {
        // StringBuilder has the same methods but is not thread safe.
        // Always go for StringBuffer which is thread safe.
        StringBuffer sbf = new StringBuffer("Shasank");
        sbf.append(" Patel");
        sbf.replace(0,7, "Cookie");
        System.out.println(sbf);
    }
}
