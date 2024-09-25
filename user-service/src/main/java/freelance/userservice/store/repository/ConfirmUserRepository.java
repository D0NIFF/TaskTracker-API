package freelance.userservice.store.repository;

import freelance.userservice.store.entity.ConfirmUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfirmUserRepository extends JpaRepository<ConfirmUserEntity, Long> {
}
