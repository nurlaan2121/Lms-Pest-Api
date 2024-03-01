package peaksoft.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "id_gen",allocationSize = 1)
public class Student extends BaseModel{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private boolean studyFormat;
    @ManyToOne
    private Group group;
}
