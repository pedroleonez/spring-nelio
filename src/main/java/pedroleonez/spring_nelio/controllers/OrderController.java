package pedroleonez.spring_nelio.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pedroleonez.spring_nelio.entities.OrderEntity;
import pedroleonez.spring_nelio.services.OrderService;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<List<OrderEntity>> findAll() {
        List<OrderEntity> list = orderService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<OrderEntity> findById(@PathVariable Long id) {
        OrderEntity obj = orderService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
