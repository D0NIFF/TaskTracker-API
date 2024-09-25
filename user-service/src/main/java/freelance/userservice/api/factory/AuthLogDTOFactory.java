package freelance.userservice.api.factory;

import freelance.userservice.api.DTO.AuthLogDTO;
import freelance.userservice.store.entity.AuthLogEntity;
import org.springframework.stereotype.Component;

@Component
public class AuthLogDTOFactory {

    public static AuthLogDTO makeDTO(AuthLogEntity entity)
    {
        return AuthLogDTO.builder()
                .id(entity.getId())
                .userEntity(entity.getUserEntity())
                .ip(entity.getIp())
                .createdAt(entity.getCreatedAt())
                .build();
    }
}
