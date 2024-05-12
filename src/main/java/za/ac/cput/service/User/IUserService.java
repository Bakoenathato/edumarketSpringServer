package za.ac.cput.service.User;

import za.ac.cput.domain.User;
import za.ac.cput.service.IService;

import java.util.List;

public interface IUserService extends IService<User, Integer> {
    List<User> getAll();
}
