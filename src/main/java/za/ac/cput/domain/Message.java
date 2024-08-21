package za.ac.cput.domain;

import jakarta.persistence.*;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long messageId;

    private String message;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat chat;

    protected Message() {}

    private Message(Builder builder) {
        this.messageId = builder.messageId;
        this.message = builder.message;
        this.chat = builder.chat;
    }

    public static class Builder {
        private long messageId;
        private String message;
        private Chat chat;

        public Builder setMessageId(long messageId) {
            this.messageId = messageId;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setChat(Chat chat) {
            this.chat = chat;
            return this;
        }

        public Builder copy(Message message) {
            this.messageId = message.messageId;
            this.message = message.message;
            this.chat = message.chat;
            return this;
        }

        public Message build() {
            return new Message(this);
        }
    }
}
