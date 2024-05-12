package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reviewId;
    private String content;
    private String timeStamp;
    private String productId;
    private String userId;

    protected Review(){

    }
    private Review(Builder build){
        this.reviewId = builder.reviewId;
        this.content = builder.content;
        this.timeStamp = builder.timeStamp;
        this.productId = builder.productId;
        this.userId = builder.userId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public String getContent() {
        return content;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getProductId() {
        return productId;
    }

    public String getUserId() {
        return userId;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Review)) return false;
        Review review = (Review) o;
        return getReviewId() == review.getReviewId() &&
                Objects.equals(getContent(), review.getContent()) &&
                Objects.equals(getTimeStamp(), review.getTimeStamp()) &&
                Objects.equals(getProductId(), review.getProductId()) &&
                Objects.equals(getUserId(), review.getUserId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getReviewId(), getContent(), getTimeStamp(), getProductId(), getUserId());
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewId=" + reviewId +
                ", content='" + content + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", productId='" + productId + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
    public static class Builder {
        private int reviewId;
        private String content;
        private String timeStamp;
        private String productId;
        private String userId;

        public Builder setReviewId(int reviewId) {
            this.reviewId = reviewId;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        public Builder setProductId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder copy(Review review) {
            this.reviewId = review.reviewId;
            this.content = review.content;
            this.timeStamp = review.timeStamp;
            this.productId = review.productId;
            this.userId = review.userId;
            return this;
        }

        public Review build() {
            return new Review(this);
        }
    }
}

