package za.ac.cput.service;

import za.ac.cput.domain.contactinfo.Address;

import java.util.List;

public interface IAddressService extends IService<Address,Integer>{
    List<Address> getAll();
}