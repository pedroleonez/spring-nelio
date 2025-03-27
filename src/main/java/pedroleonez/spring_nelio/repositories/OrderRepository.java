package pedroleonez.spring_nelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pedroleonez.spring_nelio.entities.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    
}
