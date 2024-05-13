package za.ac.cput.service.Chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Chat;
import za.ac.cput.repository.ChatRepository;

import java.util.List;

@Service
public class ChatService implements IChatService {

    public ChatRepository chatRepository;

    @Autowired
    ChatService(ChatRepository chatRepository){
        this.chatRepository = chatRepository;
    }

    @Override
    public Chat create(Chat chat) {
        return chatRepository.save(chat);
    }

    @Override
    public Chat read(Integer chatId) {
        return chatRepository.findById(chatId).orElse(null);
    }

    @Override
    public Chat update(Chat chat) {
        return chatRepository.save(chat);
    }

    @Override
    public List<Chat> getAll() {
        return chatRepository.findAll();
    }

}
