package peaksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.entities.Instructor;
@Repository

public interface InstructorRepo extends JpaRepository<Instructor,Long> {
}
