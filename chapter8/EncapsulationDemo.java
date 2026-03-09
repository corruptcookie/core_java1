/**
 * Encapsulation is the idea that variables of an object should only be
 * set or retrieved by methods defined within the class of that object.
 * So variable should be set to private to prevent users from changing them randomly.
 * Rather give them access to public methods to read and write to the variables in a
 * defined way. (Like preventing users from setting a price to negative)
 */
class EncapsulationDemo {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.setEmpId(3);
        e1.setEmpName("E1");

        Emp e2 = new Emp();
        e2.setEmpId(4);
        e2.setEmpName("E2");

        System.out.println(e1.getEmpName());
        System.out.println(e1.getEmpId());
        System.out.println(e2.getEmpName());
        System.out.println(e2.getEmpId());
    }
}

class Emp {
    // All data members should be private
    private int empId;
    private String empName;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}