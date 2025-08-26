package battleship.battleship_game.entities;

import battleship.battleship_game.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_sequence")
    private Long id;
    private String username;
    private String email;
    private String password;
    private Boolean verified;
    private Boolean deleted;
    private LocalDateTime createdAt;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String firstname;
    private String lastname;
    private String phoneNumber;
    private String country;
}
