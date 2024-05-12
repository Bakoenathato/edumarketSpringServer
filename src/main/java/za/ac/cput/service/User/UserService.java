package za.ac.cput.service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.User;
import za.ac.cput.repository.AddressRepository;
import za.ac.cput.repository.ContactRepository;
import za.ac.cput.repository.UserRepository;

import java.util.List;

@Service
public class UserService implements IUserService {

    public AddressRepository addressRepository;
    public ContactRepository contactRepository;
    public UserRepository userRepository;

    @Autowired
    UserService(AddressRepository addressRepository, ContactRepository contactRepository, UserRepository userRepository){
        this.addressRepository = addressRepository;
        this.contactRepository = contactRepository;
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        addressRepository.save(user.getUserAddress());
        contactRepository.save(user.getUserContact());
        return userRepository.save(user);
    }

    @Override
    public User read(Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public User update(User user) {
        addressRepository.save(user.getUserAddress());
        contactRepository.save(user.getUserContact());
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
