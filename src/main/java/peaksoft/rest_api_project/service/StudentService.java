package peaksoft.rest_api_project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import peaksoft.rest_api_project.repository.StudentRepository;
import peaksoft.rest_api_project.dto.StudentRequest;
import peaksoft.rest_api_project.dto.StudentResponse;
import peaksoft.rest_api_project.dto.StudentResponseView;
import peaksoft.rest_api_project.entity.Student;
import peaksoft.rest_api_project.mapper.StudentEditMapper;
import peaksoft.rest_api_project.mapper.StudentViewMapper;

import java.util.ArrayList;
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

    public StudentResponse findById(long id){
        Student student = repository.findById(id).get();
        return viewMapper.viewStudent(student);
    }

    public StudentResponse deleteById(long id){
        Student student = repository.getById(id);
        repository.delete(student);
        return viewMapper.viewStudent(student);
    }
    public StudentResponse delete(long id){
        Student student = repository.getById(id);
        repository.delete(student);
        return viewMapper.viewStudent(student);

    }

    public StudentResponseView getAllStudentsPagination(String text,int page,int size){
        StudentResponseView responseView = new StudentResponseView();
        Pageable pageable = PageRequest.of(page-1,size);
        responseView.setResponses(view(search(text,pageable)));
        return responseView;
    }

    public List<StudentResponse> view(List<Student> students){
        List<StudentResponse> responses = new ArrayList<>();
        for (Student student:students){
            responses.add(viewMapper.viewStudent(student));
        }
        return responses;
    }

    public List<Student> search(String name, Pageable pageable){
        String text = name == null ? "":name;
        return repository.searchAndPagination(text.toUpperCase(),pageable);
    }





}
