package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.ServiceCategory;

public interface ServiceCategoryRepository extends JpaRepository<ServiceCategory, Integer> {

}
