package dp.observer;

public class Client2 {
    public static void main(String[] args) {
        HFUTPostOffice2 hfutPostOffice2 = new HFUTPostOffice2();

        Student2 studentA = new Student2("A");
        Student2 studentB = new Student2("B");
        Student2 studentC = new Student2("C");

        hfutPostOffice2.addObserver(studentA);
        hfutPostOffice2.addObserver(studentB);
        hfutPostOffice2.addObserver(studentC);

        hfutPostOffice2.setPaper("体育周刊");
        hfutPostOffice2.notifyObservers();

        hfutPostOffice2.deleteObserver(studentC);

        hfutPostOffice2.setPaper("学术人生");
        hfutPostOffice2.notifyObservers();
    }
}
