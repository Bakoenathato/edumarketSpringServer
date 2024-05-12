package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Review;
import za.ac.cput.domain.User;
import za.ac.cput.repository.ReviewRepository;

@Service
@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Review create(Review review) {
        Product product = productRepository.findById(review.getProductId()).orElse(null);
        User user = userRepository.findById(review.getUserId()).orElse(null);

        if (product == null || user == null) {
            return null;
        }

        review.setProduct(product);
        review.setUser(user);

        return reviewRepository.save(review);
    }

    @Override
    public Review read(Integer reviewId) {
        return reviewRepository.findById(reviewId).orElse(null);
    }

    @Override
    public Review update(Review review) {
        Review existingReview = reviewRepository.findById(review.getReviewId()).orElse(null);

        if (existingReview == null) {
            return null;
        }

        Product product = productRepository.findById(review.getProductId()).orElse(null);
        User user = userRepository.findById(review.getUserId()).orElse(null);

        if (product == null || user == null) {
            return null;
        }

        existingReview.setContent(review.getContent());
        existingReview.setProduct(product);
        existingReview.setUser(user);

        return reviewRepository.save(existingReview);
    }

    @Override
    public List<Review> getAll() {
        return reviewRepository.findAll();
    }
}