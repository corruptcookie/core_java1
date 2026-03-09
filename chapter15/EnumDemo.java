import java.util.SortedMap;

/*
    Enum
        - Use to create your own set of static constants
        - Can implement interface, cannot extend class (It extends enum class)
 */
enum Mobile {
    // Each enum is its own object of class mobile
    APPLE(100), SAMSUNG, HTC(60);
    int price;  // Each enum will have price

    // Can create constructors, however they are private
    Mobile() {
        price = 80;
    }

    Mobile(int p) {
        price = p;
    }

    // Can create methods
    public int getPrice() {
        return price;
    }
}

// What happens in the background?
//class Mobile {
//    static final Mobile APPLE = new Mobile();
//    static final Mobile SAMSUNG = new Mobile();
//    static final Mobile HTC = new Mobile();
//}

public class EnumDemo {
    // Can define enum inside class
//    enum Mobile {
//        APPLE, SAMSUNG, HTC
//    }
    public static void main(String[] args) {
        Mobile m = Mobile.APPLE;

        switch (m) {
            case APPLE:
                System.out.println("Apple");
                break;

            case SAMSUNG:
                System.out.println("Samsung");
                break;

            case HTC:
                System.out.println("Htc");
        }

        System.out.println(m.getPrice());

        for (Mobile name : Mobile.values()) {
            System.out.println(name);
        }
    }
}
