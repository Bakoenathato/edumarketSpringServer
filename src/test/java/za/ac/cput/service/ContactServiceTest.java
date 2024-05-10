package za.ac.cput.service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.contactinfo.Contact;
import za.ac.cput.factory.ContactFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ContactServiceTest {

    @Autowired
    private ContactService contactService;
    private  Contact contact = ContactFactory.buildContact("221069054@mycput.ac.za", "0727762597");

    @Test
    @Order(1)
    void create() {
        Contact created = contactService.create(contact);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    @Order(2)
    void read() {
        Contact read = contactService.read(contact.getStudentEmail());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update() {
        Contact newContact = new Contact.Builder().copy(contact)
        .setCellNumber("0712345678").build();
        Contact updated = contactService.update(newContact);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println(contactService.getAll());
    }
}