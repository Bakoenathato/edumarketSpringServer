package za.ac.cput.service.Chat;

import za.ac.cput.domain.Chat;
import za.ac.cput.service.IService;

import java.util.List;

public interface IChatService extends IService<Chat, Integer> {
    List<Chat> getAll();
}
