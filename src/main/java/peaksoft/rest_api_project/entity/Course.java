package peaksoft.rest_api_project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "courses")
@Getter
@Setter
public class Course {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "course_gen",sequenceName = "course_seq",allocationSize = 1)
    @Id
    private Long id;
    private String courseName;
    private int duration;

    @Transient
    private  Long companyId;

    @JsonIgnore
    @ManyToOne
    private Company company;

    @OneToOne(cascade = CascadeType.REMOVE, orphanRemoval = true)
    private Teacher teacher;

    public void getTeacher(Teacher teacher){
        this.teacher = teacher;
    }


}
