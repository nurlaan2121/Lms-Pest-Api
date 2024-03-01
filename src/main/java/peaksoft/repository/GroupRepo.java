package peaksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.entities.Group;
@Repository

public interface GroupRepo extends JpaRepository<Group,Long> {
}
