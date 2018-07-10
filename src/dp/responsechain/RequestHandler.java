package dp.responsechain;

public class RequestHandler {

    private Handler projectManager = new ProjectManager();


    public RequestHandler() {
        Handler hrManager = new HRManager();
        Handler generalManager = new GeneralManager();
        projectManager.setSuccessor(hrManager);
        hrManager.setSuccessor(generalManager);
    }

    public void handleRequest(Request request) {
        projectManager.handleRequest(request);
    }

}
