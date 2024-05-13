package za.ac.cput.factory;

import za.ac.cput.domain.Chat;
import za.ac.cput.util.Helper;

public class ChatFactory {

    public static Chat createChat(int chatId, String message, String timestamp, String productId, String user1Id, String user2Id ){

        if (Helper.isZero(chatId) || Helper.isNullOrEmpty(message)
                || Helper.isNullOrEmpty(timestamp) || Helper.isNullOrEmpty(productId) || Helper.isNullOrEmpty(user1Id) || Helper.isNullOrEmpty(user2Id))
            return null;
        return new Chat.Builder().setChatId(chatId)
                .setMessage(message)
                .setTimestamp(timestamp)
                .setProductId(productId)
                .setUser1Id(user1Id)
                .setUser2Id(user2Id)
                .build();

    }

}
