package za.ac.cput.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewId;
    private String content;
    private String timeStamp;

    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private User buyer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    protected Review(){

    }

    private Review(Builder builder){
        this.reviewId = builder.reviewId;
        this.content = builder.content;
        this.timeStamp = builder.timeStamp;
        this.buyer = builder.buyer;
        this.product = builder.product;
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

    public User getBuyer() {
        return buyer;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Review review)) return false;
        return getReviewId() == review.getReviewId() && Objects.equals(getContent(), review.getContent()) && Objects.equals(getTimeStamp(), review.getTimeStamp()) && Objects.equals(getBuyer(), review.getBuyer()) && Objects.equals(getProduct(), review.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getReviewId(), getContent(), getTimeStamp(), getBuyer(), getProduct());
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewId=" + reviewId +
                ", content='" + content + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", buyer=" + buyer +
                ", product=" + product +
                '}';
    }

    public static class Builder {
        private int reviewId;
        private String content;
        private String timeStamp;
        private User buyer;
        private Product product;

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

        public Builder setBuyer(User buyer) {
            this.buyer = buyer;
            return this;
        }

        public Builder setProduct(Product product) {
            this.product = product;
            return this;
        }

        public Builder copy(Review review) {
            this.reviewId = review.reviewId;
            this.content = review.content;
            this.timeStamp = review.timeStamp;
            this.buyer = review.buyer;
            this.product = review.product;
            return this;
        }

        public Review build() {
            return new Review(this);
        }
    }
}

