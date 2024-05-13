package Repository;

public class WishlistRepository {

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Wishlist;

    @Repository
    public interface WishlistRepository extends JpaRepository<userID,String> {

}
