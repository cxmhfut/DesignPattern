package dp.observer;

public class Student implements Reader {

    private String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public void update(PostOffice postOffice) {
        String paper = ((HFUTPostOffice) postOffice).getPaper();
        System.out.println("Student " + name + " received paper:" + paper);
    }
}
