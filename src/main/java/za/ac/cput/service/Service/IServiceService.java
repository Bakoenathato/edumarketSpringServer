package za.ac.cput.service.Service;

import za.ac.cput.domain.Service;
import za.ac.cput.service.IService;

import java.util.List;

public interface IServiceService extends IService<Service, Integer> {
    List<Service> getAll();
}
