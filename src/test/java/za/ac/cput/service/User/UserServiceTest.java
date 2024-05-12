package za.ac.cput.service.User;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.User;
import za.ac.cput.domain.contactinfo.Address;
import za.ac.cput.domain.contactinfo.Contact;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.factory.ContactFactory;
import za.ac.cput.factory.UserFactory;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserServiceTest {

    @Autowired
    private UserService userService;

    private Address address = AddressFactory.buildAddress(1,"302","Dorset Street",
            "New Market Junction","Cape Town","Western Cape", "8001");
    private Contact contact = ContactFactory.buildContact("221069054@mycput.ac.za", "0727762597");
    private User user = UserFactory.buildUser(1,"Leonard","Langa", "Customer", address, contact,"Langa#27");

    @Test
    @Order(1)
    void create() {
        User created = userService.create(user);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    @Order(2)
    void read() {
        User read = userService.read(user.getUserId());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update() {
        Contact newContact = new Contact.Builder().copy(contact)
                .setCellNumber("0712345678").build();
        assertNotNull(newContact);
        User editedUser = new User.Builder().copy(user)
                .setUserContact(newContact).build();
        assertNotNull(editedUser);
        User updated = userService.update(editedUser);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println(userService.getAll());
    }
}