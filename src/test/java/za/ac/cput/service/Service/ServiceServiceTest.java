package za.ac.cput.service.Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Service;
import za.ac.cput.domain.ServiceCategory;
import za.ac.cput.factory.ServiceCategoryFactory;
import za.ac.cput.factory.ServiceFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class ServiceServiceTest {

    @Autowired
    private ServiceService serviceService;

    public ServiceCategory serviceCategory = ServiceCategoryFactory.buildServiceCategory(1, "Repairs");
    public Service service = ServiceFactory.buildService(1, "Shoe repairs", "Get your beloved shoes repaired or cobbled.",
            "250.00", "Open 3 days of the week", serviceCategory);

    @Test
    void a_create() {
        Service createdService = serviceService.create(service);
        assertNotNull(createdService);
        System.out.println(createdService);
    }

    @Test
    void b_read() {
        Service read = serviceService.read(service.getServiceId());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void c_update() {
        Service newService = new Service.Builder().copy(service).setServicePrice("200.00").build();
        Service updatedService = serviceService.update(newService);
        assertNotNull(updatedService);
        System.out.println(updatedService);
    }

    @Test
    void d_getAll() {
        System.out.println(serviceService.getAll());
    }
}