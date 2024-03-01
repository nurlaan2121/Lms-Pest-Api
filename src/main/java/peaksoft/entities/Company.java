package peaksoft.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.nio.file.LinkOption;
import java.util.List;

@Entity
@Table(name = "companies")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@SequenceGenerator(name = "id_gen",allocationSize = 1)
public class Company extends BaseModel{
    private String name;
    private String country;
    private String address;
    private String phoneNumber;
    @OneToMany(mappedBy = "company",cascade = {CascadeType.REMOVE})
    private List<Course> courses;
    @ManyToMany(mappedBy = "companies")
    private List<Instructor> instructors;
}
