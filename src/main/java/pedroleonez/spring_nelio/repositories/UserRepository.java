package pedroleonez.spring_nelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pedroleonez.spring_nelio.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
