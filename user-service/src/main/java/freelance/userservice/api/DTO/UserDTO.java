package freelance.userservice.api.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "login", nullable = false, length = 300)
    private String login;

    @Column(name = "email", nullable = false, length = 300)
    private String email;

//    @Column(name = "password", nullable = false, length = 1000)
//    private String password;

    @Column(name = "avatar")
    private String avatar;

//    @Column(name = "balance", nullable = false)
//    private Integer balance;
//
//    @Column(name = "register_ip", nullable = false)
//    private String registerIp;

    @Column(name = "rating")
    private Double rating;

//    @Column(name = "seo_source")
//    private String seoSource;
//
//    @Column(name = "verified_at")
//    private Instant verifiedAt;
//
//    @Column(name = "created_at")
//    private Instant createdAt;
//
//    @Column(name = "updated_at")
//    private Instant updatedAt;
//
//    @Column(name = "deleted_at")
//    private Instant deletedAt;
}
