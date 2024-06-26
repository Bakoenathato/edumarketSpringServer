package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {
}
