package za.ac.cput.factory;

import za.ac.cput.domain.Chat;
import za.ac.cput.domain.Message;
import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

import java.util.Set;

public class ChatFactory {
    public static Chat createChat(Set<User> participants,Set<Message> messages) {
        if (participants == null || messages == null)
            return null;

        return new Chat.Builder()
                .setParticipants(participants)
                .setMessages(messages)
                .build();
    }

}
