package pedroleonez.spring_nelio.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import pedroleonez.spring_nelio.entities.OrderEntity;
import pedroleonez.spring_nelio.entities.UserEntity;
import pedroleonez.spring_nelio.repositories.OrderRepository;
import pedroleonez.spring_nelio.repositories.UserRepository;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    private final UserRepository userRepository;
    private final OrderRepository orderRepository;

    public TestConfig(UserRepository userRepository, OrderRepository orderRepository) {
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        UserEntity u1 = new UserEntity(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        UserEntity u2 = new UserEntity(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        OrderEntity o1 = new OrderEntity(null, Instant.parse("2019-06-20T19:53:07Z"), u1); 
        OrderEntity o2 = new OrderEntity(null, Instant.parse("2019-07-21T03:42:10Z"), u2); 
        OrderEntity o3 = new OrderEntity(null, Instant.parse("2019-07-22T15:21:22Z"), u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
