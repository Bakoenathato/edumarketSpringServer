package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Chat;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Integer> {
}
