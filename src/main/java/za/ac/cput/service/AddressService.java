package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.contactinfo.Address;
import za.ac.cput.repository.AddressRepository;

import java.util.List;

@Service
public class AddressService implements IAddressService{

    public AddressRepository addressRepository;

    @Autowired
    AddressService(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }

    @Override
    public Address create(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address read(Integer addressId) {
        return addressRepository.findById(addressId).orElse(null);
    }

    @Override
    public Address update(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    }
}
