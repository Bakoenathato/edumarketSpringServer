package za.ac.cput.service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Review;
import za.ac.cput.factory.ReviewFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ReviewServiceTest {

    @Autowired
    private ReviewService reviewService;
    private  Review review = ReviewFactory.buildReview(222,"Desk","2023-05-19 13:51","F311",222135654);

    @Test
    @Order(1)
    void create() {
        Review created = reviewService.create(review);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    @Order(2)
    void read() {
        Review read = ReviewService.read(review.getReviewId());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update() {
        Review newReview = new Review.Builder().copy(review)
                .setContent("Textbook").build();
        Review updated = ReviewService.update(newReview);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println(ReviewService.getAll());
    }
}