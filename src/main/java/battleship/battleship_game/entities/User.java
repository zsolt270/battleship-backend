package battleship.battleship_game.entities;

import jakarta.persistence.*;
import lombok.*;
import javax.management.relation.Role;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    private String username;
    private String email;
    private String password;
    private Boolean verified;
    private Boolean deleted;
    private LocalDateTime created_at;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String firstname;
    private String lastname;
    private String phone_number;
    private String country;
}
