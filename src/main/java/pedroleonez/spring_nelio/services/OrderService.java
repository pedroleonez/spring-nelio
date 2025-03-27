package pedroleonez.spring_nelio.services;

import org.springframework.stereotype.Service;

import pedroleonez.spring_nelio.entities.OrderEntity;
import pedroleonez.spring_nelio.repositories.OrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<OrderEntity> findAll() {
        return orderRepository.findAll();
    }

    public OrderEntity findById(Long id) {
        Optional<OrderEntity> obj = orderRepository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Ordem não encontrada"));
    }
}
