package za.ac.cput.service.User;

import za.ac.cput.domain.contactinfo.Contact;
import za.ac.cput.service.IService;

import java.util.List;

public interface IContactService extends IService<Contact, String> {
    List<Contact> getAll();
}
