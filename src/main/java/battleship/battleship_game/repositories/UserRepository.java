package battleship.battleship_game.repositories;

import battleship.battleship_game.entities.User;
import battleship.battleship_game.enums.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByRole(Role role);
}
