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

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class ServiceCategoryServiceTest {

    @Autowired
    private ServiceCategoryService serviceCategoryService;

    private ServiceCategory serviceCategory;

    @BeforeEach
    void a_setUp() {
        serviceCategory = ServiceCategoryFactory.buildServiceCategory(1, "Repairs");
    }

    @Test
    void b_create() {
        ServiceCategory createdCategory = serviceCategoryService.create(serviceCategory);
        assertNotNull(createdCategory);
        System.out.println(createdCategory);
    }

    @Test
    void c_read() {
        ServiceCategory readCategory = serviceCategoryService.read(serviceCategory.getServiceCat_id());

        assertNotNull(readCategory);
        System.out.println(readCategory);
    }

    @Test
    void d_update() {
        ServiceCategory newCategory = new ServiceCategory.Builder().copy(serviceCategory).setServiceCat_Name("Maintenance").build();
        ServiceCategory updatedCategory = serviceCategoryService.update(serviceCategory);
    }

    @Test
    void e_getAll() {
        System.out.println(serviceCategoryService.getAll());
    }
}