package dp.observer;

import java.util.Observable;
import java.util.Observer;

public class Student2 implements Observer {
    private String name;

    Student2(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        String paper = ((HFUTPostOffice2) o).getPaper();
        System.out.println("Student " + name + " received paper:" + paper);
    }
}
