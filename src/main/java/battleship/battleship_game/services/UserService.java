package battleship.battleship_game.services;

import battleship.battleship_game.entities.User;

public interface UserService {

    /**
     * This method checks if the {@code Admin} user exists in the database.
     *
     * @return true if {@code Admin} user already exists in the database.
     */
    Boolean checkAdminExists();

    /**
     * Saves a user in to the database.
     */
    void save(User user);
}
