package peaksoft.rest_api_project.mapper;

import org.springframework.stereotype.Component;
import peaksoft.rest_api_project.dto.TeacherRequest;
import peaksoft.rest_api_project.entity.Teacher;

@Component
public class TeacherEditMapper {

    public Teacher create(TeacherRequest request){
        if(request == null){
            return null;
        }
        Teacher teacher = new Teacher();
        teacher.setFirstName(request.getFirstName());
        teacher.setLastName(request.getLastName());
        teacher.setEmail(request.getEmail());

        return teacher;
    }

    public void update(Teacher teacher,TeacherRequest request){
        teacher.setFirstName(request.getFirstName());
        teacher.setLastName(request.getLastName());
        teacher.setEmail(request.getEmail());

    }
}
