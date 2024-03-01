package peaksoft.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "id_gen", allocationSize = 1)
public class Course extends BaseModel {
    private String courseName;
    private LocalDate dateOfStart;
    private String description;
    @ManyToOne
    private Company company;
    @ManyToMany(mappedBy = "courses")
    private List<Group> groups;
    @OneToMany
    private List<Lesson> lessons;
    @ManyToOne
    private Instructor instructor;
}
