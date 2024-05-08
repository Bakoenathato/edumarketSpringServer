package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Labour;

@Repository
public interface LabourRepository extends JpaRepository<Labour, Integer> {


}
