package peaksoft.rest_api_project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.rest_api_project.dto.TeacherRequest;
import peaksoft.rest_api_project.dto.TeacherResponse;
import peaksoft.rest_api_project.entity.Teacher;
import peaksoft.rest_api_project.mapper.TeacherEditMapper;
import peaksoft.rest_api_project.mapper.TeacherViewMapper;
import peaksoft.rest_api_project.repository.TeacherRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherRepository repository;
    private final TeacherViewMapper viewMapper;
    private final TeacherEditMapper editMapper;


    public TeacherResponse create(TeacherRequest teacherRequest){
        Teacher teacher = editMapper.create(teacherRequest);
        repository.save(teacher);
        return viewMapper.viewTeacher(teacher);
    }

    public TeacherResponse update(long id,TeacherRequest teacherRequest){
        Teacher teacher = repository.findById(id).get();
        editMapper.update(teacher,teacherRequest);
        return viewMapper.viewTeacher(repository.save(teacher));
    }

    public List<TeacherResponse> getAllTeachers(){
        return viewMapper.view(repository.findAll());
    }

    public TeacherResponse findById(long id){
        Teacher student = repository.findById(id).get();
        return viewMapper.viewTeacher(student);
    }

    public TeacherResponse deleteById(long id){
        Teacher teacher = repository.getById(id);
        repository.delete(teacher);
        return viewMapper.viewTeacher(teacher);
    }
}
