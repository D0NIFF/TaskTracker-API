package freelance.userservice.api.DTO;

import freelance.userservice.store.entity.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConfirmUserDTO {

    @Column(name = "id", nullable = false)
    private Long id;

    private UserEntity userEntity;

    private UserOperationEntity type;

    @Column(name = "token", nullable = false, length = 512)
    private String token;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "deleted_at")
    private Instant deletedAt;
}
