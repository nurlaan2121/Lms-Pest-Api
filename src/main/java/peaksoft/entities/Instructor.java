package peaksoft.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "instructors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "id_gen",allocationSize = 1)
public class Instructor extends BaseModel{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String specialization;
    @OneToMany
    private List<Course> courses;
    @ManyToMany
    private List<Company> companies;
}
