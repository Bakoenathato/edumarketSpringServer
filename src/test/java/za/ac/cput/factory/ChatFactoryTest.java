package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Chat;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ChatFactoryTest {

    @Test
    void createChat_ValidParameters_Success() {
        // Given
        Integer chatId = 123;
        String message = "Hello, Khanyi";
        String timestamp = "2024-03-27 10:00:00";
        String productId = "CLOTH003";
        String user1Id = "2";
        String user2Id = "34";
        // When

        Chat chat = ChatFactory.createChat(chatId, message, timestamp, productId, user1Id, user2Id);
        // Then
        assertNotNull(chat);
        assertEquals(chatId, chat.getChatId());
        assertEquals(message, chat.getMessage());
        assertEquals(timestamp, chat.getTimestamp());
        assertEquals(productId, chat.getProductId());
        assertEquals(user1Id, chat.getUser1Id());
        assertEquals(user2Id, chat.getUser2Id());
    }

    @Test

    void createChat_NullParameters_ReturnsNull() {
        // When
        Chat chat = ChatFactory.createChat(123, null, null, null, null, null);
        // Then
        assertNull(chat);
    }

    @Test
    void createChat_EmptyParameters_ReturnsNull() {
        // When
        Chat chat = ChatFactory.createChat( 1," ", " ", " ", " ", " ");
        // Then
        assertNull(chat);
    }
}