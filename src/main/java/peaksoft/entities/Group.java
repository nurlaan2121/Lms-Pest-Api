package peaksoft.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "groups")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "id_gen",allocationSize = 1)
public class Group extends BaseModel{
    private String groupName;
    @Column(length = 2000)
    private String imageLink;
    private String description;
    @ManyToMany
    private List<Course> courses;
    @OneToMany(mappedBy = "group")
    private List<Student> students;
}
