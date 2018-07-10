package dp.responsechain;

public class ProjectManager extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getDay() <= 3) {
            System.out.println("Project Manager:" + request);
            return;
        }

        if(getSuccessor()!=null){
            getSuccessor().handleRequest(request);
        }
    }
}
