package peaksoft.rest_api_project.mapper;

import org.springframework.stereotype.Component;
import peaksoft.rest_api_project.dto.TeacherResponse;
import peaksoft.rest_api_project.entity.Teacher;

import java.util.ArrayList;
import java.util.List;

@Component
public class TeacherViewMapper {

    public TeacherResponse viewTeacher(Teacher teacher){
        if(teacher == null){
            return null;
        }
        TeacherResponse response = new TeacherResponse();
        response.setId(teacher.getId());
        response.setFirstName(teacher.getFirstName());
        response.setLastName(teacher.getLastName());
        response.setEmail(teacher.getEmail());
//        response.setCourseName(teacher.getCourse().getCourseName());
        response.setCourseName(teacher.getCourse().getCourseName());


        return response;
    }


    public List<TeacherResponse> view(List<Teacher> teachers){
        List<TeacherResponse> responses = new ArrayList<>();
        for(Teacher teacher: teachers){
            responses.add(viewTeacher(teacher));
        }
        return responses;

    }
}
