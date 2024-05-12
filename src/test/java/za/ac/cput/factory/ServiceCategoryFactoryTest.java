package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Service;
import za.ac.cput.domain.ServiceCategory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ServiceCategoryFactoryTest {

    private ServiceCategory serviceCategory;
//    private ServiceCategoryFactory.ServiceCategoryBuilder serviceBuilder;
//
//    @BeforeEach
//    void setUp() {
//        serviceBuilder = new ServiceCategoryFactory.ServiceCategoryBuilder();
//    }

    @Test
    @Order(1)
    void buildServiceCategory() {
        serviceCategory = ServiceCategoryFactory.buildServiceCategory(1, "Hair Care & Grooming");
        assertNotNull(serviceCategory);
        System.out.println(serviceCategory);
    }

//    @Test
//    @Order(2)
//    void testServiceAddedToList() {
//        ServiceCategory serviceCat = new ServiceCategory("Braid Hair");
//    }
}