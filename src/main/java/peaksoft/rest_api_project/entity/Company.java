package peaksoft.rest_api_project.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


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
//    @OneToMany(mappedBy = "company")
//    private List<Course> courses = new ArrayList<>();

}
