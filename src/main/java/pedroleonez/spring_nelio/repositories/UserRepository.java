package pedroleonez.spring_nelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pedroleonez.spring_nelio.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
