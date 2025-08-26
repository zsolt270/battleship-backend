package battleship.battleship_game.services.impl;

import battleship.battleship_game.entities.User;
import battleship.battleship_game.enums.Role;
import battleship.battleship_game.repositories.UserRepository;
import battleship.battleship_game.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final private UserRepository userRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean checkAdminExists() {
        return userRepository.findByRole(Role.ADMIN).orElse(null) != null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(final User user) {
        userRepository.save(user);
    }
}
