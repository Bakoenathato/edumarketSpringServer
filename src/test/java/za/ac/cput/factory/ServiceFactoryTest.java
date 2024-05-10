package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Service;
import za.ac.cput.domain.ServiceCategory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ServiceFactoryTest {

    private Service service;
    private ServiceCategory serviceCategory;

    @BeforeEach
    void setUp() {
//        service = ServiceFactory.buildService(1, "Barber", "Get your hair cut or trimmed"
//        , "50.00", "Available");
        serviceCategory = ServiceCategoryFactory.buildServiceCategory(1, "Personal Care");
    }

    @Test
    @Order(1)
    void buildService() {
        service = ServiceFactory.buildService(1, "Barber", "Get your hair cut or trimmed"
       , "R50.00", "Available");
        assertNotNull(service);
        System.out.println(service);
    }

    @Test
    @Order(2)
    void buildServiceWithCategory() {
        service = ServiceFactory.buildService(2, "Braid Hair", "Get your hair braided"
        , "R350.00", "Available on weekends", serviceCategory);
        assertNotNull(service);
        System.out.println(service);
    }

    @Test
    @Order(3)
    void buildServiceWithFail(){
        service = ServiceFactory.buildService(3, "Shoe repairs", "Repair your damaged shoes",
                "", "Unavailable");
        assertNotNull(service);
        System.out.println(service);
    }


}