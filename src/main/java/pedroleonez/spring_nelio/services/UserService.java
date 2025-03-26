package pedroleonez.spring_nelio.services;

import org.springframework.stereotype.Service;
import pedroleonez.spring_nelio.entities.UserEntity;
import pedroleonez.spring_nelio.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    public UserEntity findById(Long id) {
        Optional<UserEntity> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }
}
