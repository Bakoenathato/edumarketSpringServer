package za.ac.cput.service.User;

import za.ac.cput.domain.contactinfo.Address;
import za.ac.cput.service.IService;

import java.util.List;

public interface IAddressService extends IService<Address,Integer> {
    List<Address> getAll();
}
