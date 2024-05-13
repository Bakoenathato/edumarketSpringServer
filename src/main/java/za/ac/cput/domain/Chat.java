package za.ac.cput.domain;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Chat {

    @Id
    private int chatId;
    private String message;
    private String timestamp;
    private String productId;
    private String user1Id;
    private String user2Id;

    protected Chat() {
    }

    private Chat(Builder builder) {
        this.chatId = builder.chatId;
        this.message = builder.message;
        this.timestamp = builder.timestamp;
        this.productId = builder.productId;
        this.user1Id = builder.user1Id;
        this.user2Id = builder.user2Id;
    }

    public int getChatId() {
        return chatId;
    }

    public String getMessage() {
        return message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getProductId() {
        return productId;
    }


    public String getUser1Id() {
        return user1Id;
    }


    public String getUser2Id() {
        return user2Id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chat chat)) return false;
        return Objects.equals(chatId, chat.chatId) && Objects.equals(message, chat.message) && Objects.equals(timestamp, chat.timestamp) && Objects.equals(productId, chat.productId) && Objects.equals(user1Id, chat.user1Id) && Objects.equals(user2Id, chat.user2Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chatId, message, timestamp, productId, user1Id, user2Id);
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chatId='" + chatId + '\'' +
                ", message='" + message + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", productId='" + productId + '\'' +
                ", user1Id='" + user1Id + '\'' +
                ", user2Id='" + user2Id + '\'' +
                '}';
    }

    public static class Builder {
        private int chatId;
        private String message;
        private String timestamp;
        private String productId;
        private String user1Id;
        private String user2Id;

        public Builder setChatId(int chatId) {
            this.chatId = chatId;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }


        public Builder setProductId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder setUser1Id(String user1Id) {
            this.user1Id = user1Id;
            return this;
        }

        public Builder setUser2Id(String user2Id) {
            this.user2Id = user2Id;
            return this;
        }

        public Builder copy(Chat chat) {
            this.chatId = chat.chatId;
            this.message = chat.message;
            this.timestamp = chat.timestamp;
            this.productId = chat.productId;
            this.user1Id = chat.user1Id;
            this.user2Id = chat.user2Id;
            return this;
        }

        public Chat build() {
            return new Chat(this);
        }


    }

}
