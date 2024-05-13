package za.ac.cput.service.Chat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Chat;
import za.ac.cput.factory.ChatFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class ChatServiceTest {

    @Autowired
    private ChatService chatService;

    private  Chat chat1 = ChatFactory.createChat(123, "Hello Khanyi", "2024-03-27 10:00:00", "CLOTH003", "2",  "34");;
    private  Chat chat2 = ChatFactory.createChat(122, "Good day Mihle", "2024-05-07 10:00:00", "CLOTH02", "9",  "84");;

//    @Test
//    void a_setup() {
//        chat1 = ChatFactory.createChat(123, "Hello Khanyi", "2024-03-27 10:00:00", "CLOTH003", "2",  "34");
//        assertNotNull(chat1);
//        System.out.println(chat1);
//        chat2 = ChatFactory.createChat(122, "Good day Mihle", "2024-05-07 10:00:00", "CLOTH02", "9",  "84");
//        assertNotNull(chat2);
//        System.out.println(chat2);
//
//    }

    @Test
    void b_create() {
        Chat created1 = chatService.create(chat1);
        assertNotNull(created1);
        System.out.println(created1);
        Chat created2 = chatService.create(chat2);
        assertNotNull(created2);
        System.out.println(created2);

    }

    @Test
    void c_read() {
        Chat read = chatService.read(chat2.getChatId());
        assertNotNull(read);
        System.out.println(read);

    }

    @Test
    void d_update() {
        Chat newChat = new Chat.Builder().copy(chat2).setChatId(125).build();
        Chat updated = chatService.update(newChat);
        assertNotNull(updated);
        System.out.println(updated);

    }

    @Test
    void e_getAll() {
        System.out.println(chatService.getAll());
    }
}