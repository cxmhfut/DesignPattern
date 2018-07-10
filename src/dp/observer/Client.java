package dp.observer;

public class Client {
    public static void main(String[] args) {
        HFUTPostOffice hfutPostOffice = new HFUTPostOffice();

        Student studentA = new Student("A");
        Student studentB = new Student("B");
        Student studentC = new Student("C");

        hfutPostOffice.attachReader(studentA);
        hfutPostOffice.attachReader(studentB);
        hfutPostOffice.attachReader(studentC);

        hfutPostOffice.setPaper("体育周刊");
        hfutPostOffice.publish();

        hfutPostOffice.detachReader(studentC);

        hfutPostOffice.setPaper("学术人生");
        hfutPostOffice.publish();
    }
}
