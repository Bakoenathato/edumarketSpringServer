package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.contactinfo.Address;
import za.ac.cput.domain.contactinfo.Contact;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
