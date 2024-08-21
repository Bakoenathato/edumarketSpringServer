package za.ac.cput.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Chat {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long chatId;

   @ManyToMany
   @JoinTable(name = "chat_participants", joinColumns = @JoinColumn(name = "chat_id"))
   private Set<User> participants = new HashSet<>();

   @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL, orphanRemoval = true)
   private Set<Message> messages = new HashSet<>();

    protected Chat() {
    }

    private Chat(Builder builder) {
        this.chatId = builder.chatId;
        this.participants = builder.participants;
        this.messages = builder.messages;
    }

    public long getChatId() {
        return chatId;
    }

    public Set<User> getParticipants() {
        return participants;
    }

    public Set<Message> getMessages() {
        return messages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chat chat)) return false;
        return getChatId() == chat.getChatId() && Objects.equals(getParticipants(), chat.getParticipants()) && Objects.equals(getMessages(), chat.getMessages());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChatId(), getParticipants(), getMessages());
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chatId=" + chatId +
                ", participants=" + participants +
                ", messages=" + messages +
                '}';
    }

    public static class Builder {
        private long chatId;
        private Set<User> participants = new HashSet<>();
        private Set<Message> messages = new HashSet<>();

        public Builder setChatId(long chatId) {
            this.chatId = chatId;
            return this;
        }

        public Builder setParticipants(Set<User> participants) {
            this.participants = participants;
            return this;
        }

        public Builder setMessages(Set<Message> messages) {
            this.messages = messages;
            return this;
        }

        public Builder copy(Chat chat) {
            this.chatId = chat.chatId;
            this.participants = chat.participants;
            this.messages = chat.messages;
            return this;
        }

        public Chat build() {
            return new Chat(this);
        }


    }

}
