package za.ac.cput.factory;

import za.ac.cput.domain.Review;

public class ReviewFactory {
    public static Review buildReview(int reviewId, String content, String timeStamp, String productId, String userId) {
        if (reviewId <= 0 || Helper.isEmpty(content) || Helper.isEmpty(timeStamp) || Helper.isEmpty(productId) || Helper.isEmpty(userId)) {
            return null;
        }
        return new Review.Builder()
                .setReviewId(reviewId)
                .setContent(content)
                .setTimeStamp(timeStamp)
                .setProductId(productId)
                .setUserId(userId)
                .build();
    }
}