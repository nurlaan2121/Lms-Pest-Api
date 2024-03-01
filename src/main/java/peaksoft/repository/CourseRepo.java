package peaksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.entities.Course;
@Repository

public interface CourseRepo extends JpaRepository<Course,Long> {
}
