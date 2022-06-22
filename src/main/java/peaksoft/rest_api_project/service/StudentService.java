package peaksoft.rest_api_project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.rest_api_project.repository.StudentRepository;
import peaksoft.rest_api_project.dto.StudentRequest;
import peaksoft.rest_api_project.dto.StudentResponse;
import peaksoft.rest_api_project.entity.Student;
import peaksoft.rest_api_project.mapper.StudentEditMapper;
import peaksoft.rest_api_project.mapper.StudentViewMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repository;
    private final StudentEditMapper editMapper;
    private final StudentViewMapper viewMapper;


    public StudentResponse create(StudentRequest studentRequest){
        Student student = editMapper.create(studentRequest);
        repository.save(student);
        return viewMapper.viewStudent(student);
    }

    public StudentResponse update(long id,StudentRequest studentRequest){
        Student student = repository.findById(id).get();
        editMapper.update(student,studentRequest);
        return viewMapper.viewStudent(repository.save(student));
    }

    public List<StudentResponse> getAllStudents(){
        return viewMapper.view(repository.findAll());
    }

    public StudentResponse findById(long id){
        Student student = repository.findById(id).get();
        return viewMapper.viewStudent(student);
    }

    public StudentResponse deleteById(long id){
        Student student = repository.getById(id);
        repository.delete(student);
        return viewMapper.viewStudent(student);
    }



}
