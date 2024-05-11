package za.ac.cput.service.Service;

import za.ac.cput.domain.Service;
import za.ac.cput.domain.ServiceCategory;
import za.ac.cput.service.IService;

import java.util.List;

public interface IServiceCategoryService extends IService<ServiceCategory, Integer>{
    List<ServiceCategory> getAll();
}
