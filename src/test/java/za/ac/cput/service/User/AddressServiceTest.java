package za.ac.cput.service.User;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.contactinfo.Address;
import za.ac.cput.factory.AddressFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AddressServiceTest {

    @Autowired
    private AddressService addressService;
    private Address address = AddressFactory.buildAddress(1,"302","Dorset Street",
            "New Market Junction", "Cape Town", "Western Cape", "8001");


    @Test
    @Order(1)
    void create()
    {
        Address created = addressService.create(address);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    @Order(2)
    void read()
    {
        Address read = addressService.read(address.getAddressId());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update()
    {
        Address newAddress = new Address.Builder().copy(address)
                .setStreetNum("12").build();
        Address updated = addressService.update(newAddress);
        assertNotNull(updated);
        System.out.println(updated);

    }

    @Test
    @Order(4)
    void getAll()
    {
        System.out.println(addressService.getAll());
    }
}