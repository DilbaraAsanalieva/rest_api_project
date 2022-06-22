package peaksoft.rest_api_project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "groups")

public class Group {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "group_gen",sequenceName = "group_seq",allocationSize = 1)
    @Id
    private Long id;
    private String groupName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfStart;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfFinish;
//    @ManyToOne (cascade = MERGE) //orphanRemoval = true
//    private Course course;
//
//    @OneToMany(mappedBy = "group",cascade = CascadeType.ALL, orphanRemoval = true )
//    private List<Student> students = new ArrayList<>();
}
