package peaksoft.rest_api_project.mapper;

import org.springframework.stereotype.Component;
import peaksoft.rest_api_project.dto.StudentRequest;
import peaksoft.rest_api_project.entity.Student;

@Component
public class StudentEditMapper {

    public Student create(StudentRequest request){
        if(request == null){
            return null;
        }
        Student student = new Student();
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setEmail(request.getEmail());
        student.setStudyFormat(request.getStudyFormat());
        student.setGroupId(request.getGroupId());

        return student;
    }

    public void update(Student student,StudentRequest request){
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setEmail(request.getEmail());
        student.setStudyFormat(request.getStudyFormat());
        student.setGroupId(request.getGroupId());


    }
}
