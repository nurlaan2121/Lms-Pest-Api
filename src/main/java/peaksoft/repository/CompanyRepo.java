package peaksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.entities.Company;
@Repository
public interface CompanyRepo extends JpaRepository<Company,Long> {
}
