package battleship.battleship_game.security;

import battleship.battleship_game.entities.User;
import battleship.battleship_game.enums.Role;
import battleship.battleship_game.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
@Slf4j
public class InitialAdminRunner implements CommandLineRunner {

    final private UserService userService;
    final private SecurityConfiguration securityConfiguration;

    @Override
    public void run(String... args) throws Exception {

        if(userService.checkAdminExists()) {
            log.info("The initial admin already exists in the database, skipping initialization...");
            return;
        }

        final User initialAdmin = User.builder()
                .username("admin1")
                .email("admin1@admin.com")
                .password(securityConfiguration.passwordEncoder().encode(securityConfiguration.initialAdminPassword))
                .verified(true)
                .deleted(false)
                .createdAt(LocalDateTime.now())
                .role(Role.ADMIN)
                .firstname("John")
                .lastname("Doe")
                .phoneNumber("+00 000000000")
                .country("Hungary")
                .build();

        userService.save(initialAdmin);
    }
}
