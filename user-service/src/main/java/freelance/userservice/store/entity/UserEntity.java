package freelance.userservice.store.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "\"user\"")
public class UserEntity {
    @Id
    @ColumnDefault("nextval('user_id_seq'::regclass)")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "login", nullable = false, length = 300)
    private String login;

    @Column(name = "email", nullable = false, length = 300)
    private String email;

    @Column(name = "password", nullable = false, length = 1000)
    private String password;

    @Column(name = "avatar")
    private String avatar;

    @ColumnDefault("0")
    @Column(name = "balance", nullable = false)
    private Integer balance;

    @Column(name = "register_ip", nullable = false)
    private String registerIp;

    @Column(name = "rating")
    private Double rating;

    @ColumnDefault("NULL::character varying")
    @Column(name = "seo_source")
    private String seoSource;

    @Column(name = "verified_at")
    private Instant verifiedAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "deleted_at")
    private Instant deletedAt;

}