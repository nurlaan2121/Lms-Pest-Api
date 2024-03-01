package peaksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.entities.Student;
@Repository

public interface StudentRepo extends JpaRepository<Student,Long> {
}
