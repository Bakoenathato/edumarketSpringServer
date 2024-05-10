package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import za.ac.cput.domain.User;
import za.ac.cput.domain.contactinfo.Address;
import za.ac.cput.domain.contactinfo.Contact;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserFactoryTest {

    private User user;
    private Address address;
    private Contact contact;

    @BeforeEach
    void setUp() {
        address = AddressFactory.buildAddress(1,"302","Dorset","New Market Junction","Cape Town", "Western Cape", "8001");
        contact = ContactFactory.buildContact("221069054@mycput.ac.za","0727762597");
    }


    @Test
    @Order(1)
    void buildUser() {
        user = UserFactory.buildUser(1,"Leonard", "Langa", "Customer", address, contact, "Langa$27");
        assertNotNull(user);
        System.out.println(user);
    }

    @Test
    @Order(2)
    void buildUserWithFail_a() {
        user = UserFactory.buildUser(1,"Leonard", "Langa", "Customer", address, contact, "langa$27");
        assertNotNull(user);
        System.out.println(user);
    }

    @Test
    @Order(3)
    void buildUserWithFail_b() {
        user = UserFactory.buildUser(1,"Leonard", "Langa", "Customer", address, contact, "Langa27");
        assertNotNull(user);
        System.out.println(user);
    }

    @Test
    @Order(4)
    void buildUserWithFail_c() {
        user = UserFactory.buildUser(1,"Leonard", "Langa", "Customer", address, contact, "Langa$leo");
        assertNotNull(user);
        System.out.println(user);
    }

    @Test
    @Order(5)
    void buildUserWithFail_d() {
        address = AddressFactory.buildAddress(1,"","Dorset","New Market Junction","Cape Town", "Western Cape", "8001");
        user = UserFactory.buildUser(1,"Leonard", "Langa", "Customer", address, contact, "Langa$27");
        assertNotNull(user);
        System.out.println(user);
    }

    @Test
    @Order(6)
    void buildUserWithFail_e() {
        contact = ContactFactory.buildContact("","0727762597");
        user = UserFactory.buildUser(1,"Leonard", "Langa", "Customer", address, contact, "Langa$27");
        assertNotNull(user);
        System.out.println(user);
    }

    @Test
    @Order(7)
    void buildUserWithFail_f() {
        user = UserFactory.buildUser(1,"", "Langa", "Customer", address, contact, "Langa$27");
        assertNotNull(user);
        System.out.println(user);
    }

    @Test
    @Order(8)
    void buildUserWithFail_g() {
        user = UserFactory.buildUser(1,"Leonard", "", "Customer", address, contact, "Langa$27");
        assertNotNull(user);
        System.out.println(user);
    }

    @Test
    @Order(9)
    void buildCompleteUser() {
        user = UserFactory.buildUser(1,"Leonard","Langa", "Admin", "Leonard7#You",
                1,"12", "Jupiter Street", "Ruskin House", "Cape Town", "Western Cape", "8000",
                "langaleonard74@gmail.com","0712345678");
        assertNotNull(user);
        System.out.println(user);
    }

    @Test
    @Order(10)
    void buildCompleteUserWithFail() {
        user = UserFactory.buildUser(1,"Leonard","Langa", "Admin", "Leonard7#You",
                1,"12", "Jupiter Street", "Ruskin House", "Cape Town", "Western Cape", "8000",
                "langaleonard74@gmail.com","");
        assertNotNull(user);
        System.out.println(user);
    }

    @Test
    @Order(11)
    void buildUserWithFail_h() {
        user = UserFactory.buildUser(0,"Leonard", "Langa", "Customer", address, contact, "Langa$27");
        assertNotNull(user);
        System.out.println(user);
    }
}