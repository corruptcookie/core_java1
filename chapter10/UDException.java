// User Defined Exception
class UDException {
    public static void main(String[] args) {
        int i = 5;

        try {
            if (i < 10) {
                throw new MyException("Error");
            }

        } catch (Exception e) {
            System.out.println(e);

        }
    }
}

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}