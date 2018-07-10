package dp.observer;

import java.util.Observable;

public class HFUTPostOffice2 extends Observable {

    private String paper;//刊物

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        setChanged();
        this.paper = paper;
    }

}
