package peaksoft.rest_api_project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.CascadeType.MERGE;

@Entity
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Student {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "student_gen",sequenceName = "student_seq",allocationSize = 1)
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    @Enumerated(EnumType.STRING)
    private StudyFormat studyFormat;


    @ManyToOne(cascade = {MERGE})
    @JsonIgnore
    private Group group;

    @Transient
    private Long groupId;


    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }




}
