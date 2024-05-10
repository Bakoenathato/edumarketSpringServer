package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.contactinfo.Address;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AddressFactoryTest {

    private Address address;

    @Test
    @Order(1)
    void buildAddress() {

        address = AddressFactory.buildAddress(1,"302","Dorset","New Market Junction","Cape Town", "Western Cape", "8001");
        assertNotNull(address);
        System.out.println(address);
    }

    @Test
    @Order(2)
    void buildAddressWithFail_a() {

        address = AddressFactory.buildAddress(1,"302","Dorset","New Market Junction","Cape Town", "Western Cape", "");
        assertNotNull(address);
        System.out.println(address);
    }

    @Test
    @Order(3)
    void buildAddressWithFail_b() {

        address = AddressFactory.buildAddress(1,"302","Dorset","New Market Junction","Cape Town", "Western Cape", "800");
        assertNotNull(address);
        System.out.println(address);
    }

    @Test
    @Order(4)
    void buildAddressWithFail_c() {

        address = AddressFactory.buildAddress(1,"302","Dorset","New Market Junction","Cape Town", "Western Cape", "80001");
        assertNotNull(address);
        System.out.println(address);
    }

    @Test
    @Order(5)
    void buildAddressWithFail_d() {

        address = AddressFactory.buildAddress(1,"302","Dorset","New Market Junction","Cape Town", "Western Cape", "lana");
        assertNotNull(address);
        System.out.println(address);
    }

    @Test
    @Order(6)
    void buildAddressWithFail_e() {

        address = AddressFactory.buildAddress(1,"0","Dorset","New Market Junction","Cape Town", "Western Cape", "8001");
        assertNotNull(address);
        System.out.println(address);
    }

    @Test
    @Order(7)
    void buildAddressWithFail_f() {

        address = AddressFactory.buildAddress(1,"302",
                "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Porro inventore libero voluptatibus veniam nostrum ullam debitis, eligendi cumque numquam facere architecto, ad aut pariatur officia possimus!",
                "New Market Junction","Cape Town", "Western Cape", "8001");
        assertNotNull(address);
        System.out.println(address);
    }

    @Test
    @Order(8)
    void buildAddressWithFail_g() {

        address = AddressFactory.buildAddress(0,"302","Dorset","New Market Junction","Cape Town", "Western Cape", "8001");
        assertNotNull(address);
        System.out.println(address);
    }
}