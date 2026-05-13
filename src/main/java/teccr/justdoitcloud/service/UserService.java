package teccr.justdoitcloud.service;

import org.springframework.stereotype.Service;
import teccr.justdoitcloud.data.User;
import teccr.justdoitcloud.repository.UserRepository;
import java.util.Optional;

/**
 * Service responsible for user-related business logic.
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    // Constructor injection of UserRepository
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Find  a user by username.
     *
     * @param username the username to look up
     * @return Optional containing the User if found
     */
    public Optional<User> findByUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            return Optional.empty();
        }
        return userRepository.findByUsername(username.trim());
    }
}
