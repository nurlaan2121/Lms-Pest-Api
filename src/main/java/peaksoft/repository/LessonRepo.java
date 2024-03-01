package peaksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.entities.Lesson;
@Repository

public interface LessonRepo extends JpaRepository<Lesson,Long> {
}
