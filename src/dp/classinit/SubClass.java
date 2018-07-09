package dp.classinit;

public class SubClass extends SuperClass{
    static int static_var = printInit(0,"Sub Class static variable init.");
    int var = printInit(1,"Sub Class variable init.");

    static {
        System.out.println("Sub Class static block init.");
    }

    {
        System.out.println("Sub Class block init.");
    }

    public SubClass(){
        System.out.println("Sub Class Constructor init.");
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
    }
}
