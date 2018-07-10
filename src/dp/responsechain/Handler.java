package dp.responsechain;

public abstract class Handler {

    private Handler successor;

    protected Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
