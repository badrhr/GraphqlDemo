package org.xproce.graphqldemosat;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.xproce.graphqldemosat.dao.entities.User;
import org.xproce.graphqldemosat.dao.repositories.UserRepository;

import java.util.List;

@SpringBootApplication
public class GraphqldemosatApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqldemosatApplication.class, args);
    }

    @Bean
    CommandLineRunner start(UserRepository userRepository){
        return args -> {
            List<User> users = List.of(
                    User.builder().name("X").email("x@email.com").password("12345qbc").build(),
                    User.builder().name("Y").email("Y@email.com").password("3486FG646").build(),
                    User.builder().name("E").email("E@email.com").password("654G68GR").build(),
                    User.builder().name("R").email("R@email.com").password("E68R4R").build()
            );

            userRepository.saveAll(users);
        };
    }

}
