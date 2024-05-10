package za.ac.cput.service;

import za.ac.cput.domain.contactinfo.Contact;

import java.util.List;

public interface IContactService extends IService<Contact, String>{
    List<Contact> getAll();
}
