package freelance.userservice.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserOperationRepository extends JpaRepository<UserOperationEntity, Long> {
}
