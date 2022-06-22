package peaksoft.rest_api_project.exceptions;

public class GroupNotFoundException extends RuntimeException{
    public GroupNotFoundException() {
    }

    public GroupNotFoundException(String message) {
        super(message);
    }
}
