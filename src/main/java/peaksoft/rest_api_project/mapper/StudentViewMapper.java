package peaksoft.rest_api_project.mapper;

import org.springframework.stereotype.Component;
import peaksoft.rest_api_project.dto.StudentResponse;
import peaksoft.rest_api_project.entity.Student;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentViewMapper {

    public StudentResponse viewStudent(Student student){
        if(student == null){
            return null;
        }
        StudentResponse response = new StudentResponse();
        response.setId(student.getId());
        response.setFirstName(student.getFirstName());
        response.setLastName(student.getLastName());
        response.setEmail(student.getEmail());
        response.setStudyFormat(student.getStudyFormat());
        response.setGroupName(student.getGroup().getGroupName());

        return response;
    }


    public List<StudentResponse> view(List<Student> students){
        List<StudentResponse> responses = new ArrayList<>();
        for(Student student: students){
            responses.add(viewStudent(student));
        }
        return responses;

    }

}
