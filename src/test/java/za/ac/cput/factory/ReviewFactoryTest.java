package za.ac.cput.factory;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Review;
import static org.junit.jupiter.api.Assertions.*;

public class ReviewFactoryTest {
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ReviewFactoryTest {

    private Review review;

    @Test
    @Order(1)
    void buildReview() {

        review = ReviewFactory.buildReview(111,"laptop","2023-05-12 10:00","E211",222135654);
        assertNotNull(review);
        System.out.println(review);
    }

    @Test
    @Order(2)
    void buildReviewWithFail_a() {

        review = ReviewFactory.buildReview(111,"laptop","2023-05-12 10:00","E211",222135654);
        assertNotNull(review);
        System.out.println(review);
    }

    @Test
    @Order(3)
    void buildReviewWithFail_b() {

        review = ReviewFactory.buildReview(111,"laptop","2023-05-12 10:00","E211",222135654);
        assertNotNull(review);
        System.out.println(review);
    }

    @Test
    @Order(4)
    void buildReviewWithFail_c() {

        review = ReviewFactory.buildReview(111,"laptop","2023-05-12 10:00","E211",222135654);
        assertNotNull(review);
        System.out.println(review);
    }

    @Test
    @Order(5)
    void buildReviewWithFail_d() {

        review = ReviewFactory.buildReview(111,"laptop","2023-05-12 10:00","E211",222135654);
        assertNotNull(review);
        System.out.println(review);
    }

    @Test
    @Order(6)
    void buildReviewWithFail_e() {

        review = ReviewFactory.buildReview(-111,"laptop","2023-05-12 10:00","E211",222135654);
        assertNull(review);
    }

    @Test
    @Order(7)
    void buildReviewWithFail_f() {

        review = ReviewFactory.buildReview(111,"laptop","2023-05-12 10:00","E211",222135654);
        assertNotNull(review);
        System.out.println(review);
    }

    @Test
@Order(8)
void buildReviewWithFail_g(){
        review = ReviewFactory.Review(111,"laptop","2023-05-12 10:00","E211",222135654);
        assertNotNull(review);
        System.out.println(review);
    }
}
}