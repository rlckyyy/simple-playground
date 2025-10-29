package mcs.authservice.service;

import lombok.RequiredArgsConstructor;
import mcs.authservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
}
