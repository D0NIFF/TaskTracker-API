package freelance.userservice.store.repository;

import freelance.userservice.store.entity.AuthLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthLogRepository extends JpaRepository<AuthLogEntity, Long>
{

}
