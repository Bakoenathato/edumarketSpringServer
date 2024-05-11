package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.contactinfo.Contact;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ContactFactoryTest {

    private Contact contact;


    @Test
    @Order(1)
    void buildContact()
    {
        contact = ContactFactory.buildContact("221069054@mycput.ac.za","0727762597");
        assertNotNull(contact);
        System.out.println(contact);

    }

    @Test
    @Order(2)
    void buildContactWithFail_a()
    {
        contact = ContactFactory.buildContact("","0727762597");
        assertNotNull(contact);
        System.out.println(contact);
    }

    @Test
    @Order(3)
    void buildContactWithFail_b()
    {
        contact = ContactFactory.buildContact("@mycput.ac.za","0727762597");
        assertNotNull(contact);
        System.out.println(contact);
    }

    @Test
    @Order(4)
    void buildContactWithFail_c()
    {
        contact = ContactFactory.buildContact("221069054mycput.ac.za","0727762597");
        assertNotNull(contact);
        System.out.println(contact);
    }

    @Test
    @Order(5)
    void buildContactWithFail_d()
    {
        contact = ContactFactory.buildContact("221069054@","0727762597");
        assertNotNull(contact);
        System.out.println(contact);
    }

    @Test
    @Order(6)
    void buildContactWithFail_e()
    {
        contact = ContactFactory.buildContact("221069054@mycput.ac.za","072776");
        assertNotNull(contact);
        System.out.println(contact);
    }

    @Test
    @Order(7)
    void buildContactWithFail_f()
    {
        contact = ContactFactory.buildContact("221069054@mycput.ac.za","0727762597123");
        assertNotNull(contact);
        System.out.println(contact);
    }

    @Test
    @Order(8)
    void buildContactWithFail_g()
    {
        contact = ContactFactory.buildContact("221069054@mycput.ac.za","Leonard");
        assertNotNull(contact);
        System.out.println(contact);
    }

}