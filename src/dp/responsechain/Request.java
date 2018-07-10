package dp.responsechain;

public class Request {
    private int day;//请假天数
    private String reason;//请假理由

    Request(int day, String reason) {
        this.day = day;
        this.reason = reason;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Request{" +
                "day=" + day +
                ", reason='" + reason + '\'' +
                '}';
    }
}
