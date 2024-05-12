package za.ac.cput.service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.repository.ServiceCategoryRepository;
import za.ac.cput.repository.ServiceRepository;

import java.util.List;

@Service
public class ServiceService implements IServiceService {

    public ServiceRepository serviceRepository;
    public ServiceCategoryRepository serviceCategoryRepository;

    @Autowired
    ServiceService(ServiceRepository serviceRepository, ServiceCategoryRepository serviceCategoryRepository) {
        this.serviceRepository = serviceRepository;
        this.serviceCategoryRepository = serviceCategoryRepository;
    }

    @Override
    public za.ac.cput.domain.Service create(za.ac.cput.domain.Service service){
        serviceRepository.save(service);
        serviceCategoryRepository.save(service.getServiceCategory());
        return serviceRepository.save(service);
    }

    @Override
    public za.ac.cput.domain.Service read(Integer serviceId) {
        serviceRepository.findById(serviceId).orElse(null);
        return null;
    }


    @Override
    public za.ac.cput.domain.Service update(za.ac.cput.domain.Service service){
        serviceCategoryRepository.save(service.getServiceCategory());
        serviceRepository.save(service);
        return serviceRepository.save(service);
    }

    @Override
    public List<za.ac.cput.domain.Service> getAll() {
        return serviceRepository.findAll();
    }


}
