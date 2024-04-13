package com.example.bank.user;

import com.example.bank._core.errors.exception.Exception401;
import com.example.bank._core.utils.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public String login(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, password)
                .orElseThrow(()-> new Exception401("username or password incorrect"));
        String jwt = JwtUtil.create(user);
        return jwt;
    }
}
