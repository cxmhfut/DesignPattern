package dp.responsechain;

public class Client {
    public static void main(String[] args) {
        RequestHandler requestHandler = new RequestHandler();

        Request request1 = new Request(5, "病假");
        Request request2 = new Request(2, "事假");
        Request request3 = new Request(15, "出差");

        requestHandler.handleRequest(request1);
        requestHandler.handleRequest(request2);
        requestHandler.handleRequest(request3);
    }
}
