package peaksoft.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.entities.Task;
@Repository
public interface TaskRepo extends JpaRepository<Task,Long> {

}
