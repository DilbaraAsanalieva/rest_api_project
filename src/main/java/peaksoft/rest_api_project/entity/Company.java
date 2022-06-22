package peaksoft.rest_api_project.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="companies")
@Getter
@Setter

public class Company {

    @SequenceGenerator(name = "company_gen", sequenceName = "company_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Long id;
    private String companyName;
    private String locatedCountry;
    @OneToMany(fetch=FetchType.EAGER ,cascade = {CascadeType.MERGE, CascadeType.REMOVE}, mappedBy = "company")
    private List<Course> courses;

    public void addCourse(Course course) {
        this.courses.add(course);
    }

}
