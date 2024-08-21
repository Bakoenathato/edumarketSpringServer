package za.ac.cput.factory;

import za.ac.cput.domain.Product;
import za.ac.cput.domain.Review;
import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

public class ReviewFactory {
    public static Review buildReview(int reviewId, String content, String timeStamp, User buyer, Product product) {
        if (reviewId <= 0 || Helper.isNullOrEmpty(content) || Helper.isNullOrEmpty(timeStamp) || buyer == null || product == null) {
            return null;
        }
        return new Review.Builder()
                .setReviewId(reviewId)
                .setContent(content)
                .setTimeStamp(timeStamp)
                .setBuyer(buyer)
                .setProduct(product)
                .build();
    }
}