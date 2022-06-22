package peaksoft.rest_api_project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.rest_api_project.dto.CourseRequest;
import peaksoft.rest_api_project.dto.CourseResponse;
import peaksoft.rest_api_project.entity.Course;
import peaksoft.rest_api_project.mapper.CourseEditMapper;
import peaksoft.rest_api_project.mapper.CourseViewMapper;
import peaksoft.rest_api_project.repository.CourseRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository repository;
    private final CourseViewMapper viewMapper;
    private final CourseEditMapper editMapper;

    public CourseResponse create(CourseRequest courseRequest){
        Course course = editMapper.create(courseRequest);
        repository.save(course);
        return viewMapper.viewCourse(course);
    }

    public CourseResponse update(long id,CourseRequest courseRequest){
        Course course = repository.findById(id).get();
        editMapper.update(course,courseRequest);
        return viewMapper.viewCourse(repository.save(course));
    }
    public List<CourseResponse> getAllCourses(){
        return viewMapper.view(repository.findAll());
    }

    public CourseResponse findById(long id){
        Course course = repository.findById(id).get();
        return viewMapper.viewCourse(course);
    }
    public CourseResponse deleteById(long id){
        Course course = repository.getById(id);
        repository.delete(course);
        return viewMapper.viewCourse(course);
    }

}
