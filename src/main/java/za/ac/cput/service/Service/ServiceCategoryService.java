package za.ac.cput.service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.ServiceCategory;
import za.ac.cput.repository.ServiceCategoryRepository;
import za.ac.cput.repository.ServiceRepository;

import java.util.List;

@Service
public class ServiceCategoryService implements IServiceCategoryService {

    public ServiceCategoryRepository ServiceCatRepository;
    public ServiceRepository serviceRepository;

    @Autowired
    ServiceCategoryService(ServiceCategoryRepository ServiceCatRepository) {
        this.ServiceCatRepository = ServiceCatRepository;
    }

    @Override
    public ServiceCategory create(ServiceCategory serviceCategory) {
        return ServiceCatRepository.save(serviceCategory);
    }

    @Override
    public ServiceCategory read(Integer serviceCat_id) {
        return ServiceCatRepository.findById(serviceCat_id).orElse(null);
    }

    @Override
    public ServiceCategory update(ServiceCategory serviceCategory) {
        return ServiceCatRepository.save(serviceCategory);
    }

    @Override
    public List<ServiceCategory> getAll() {
        return ServiceCatRepository.findAll();
    }
}
