package com.example.bank.user;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void findByUsername_test() {
        String username = "ssar";
        String password = "1234";

        Optional<User> userOP = userRepository.findByUsernameAndPassword(username,password);

        Assertions.assertThat(userOP.get().getUsername()).isEqualTo("ssar");
    }
}
