package peaksoft.rest_api_project.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Teacher {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "teacher_gen",sequenceName = "teacher_seq",allocationSize = 1)
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    @Transient
    private Long courseId;

    @OneToOne
    @JsonIgnore
    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}
