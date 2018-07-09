package dp.classinit;

public class SuperClass {

    static int static_var = printInit(0, "Super Class static variable init.");
    int var = printInit(1, "Super Class variable init.");

    static {
        System.out.println("Super Class static block init.");
    }

    {
        System.out.println("Super Class block init.");
    }

    public SuperClass() {
        System.out.println("Super Class Constructor init.");
    }

    public static int printInit(int value, String desc) {
        System.out.println(desc);
        return value;
    }
}
