package peaksoft.rest_api_project.entity;

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

    //    @ManyToOne
//    private Company company;
}
