package peaksoft.rest_api_project.exceptions;

public class CourseNotFoundException extends RuntimeException{
    public CourseNotFoundException() {
    }

    public CourseNotFoundException(String message) {
        super(message);
    }
}
