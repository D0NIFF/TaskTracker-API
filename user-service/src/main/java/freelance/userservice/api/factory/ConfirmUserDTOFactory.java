package freelance.userservice.api.factory;

import freelance.userservice.api.DTO.ConfirmUserDTO;
import freelance.userservice.store.entity.ConfirmUserEntity;
import org.springframework.stereotype.Component;

@Component
public class ConfirmUserDTOFactory {

    public static ConfirmUserDTO makeDTO(ConfirmUserEntity entity)
    {
        return ConfirmUserDTO.builder()
                .id(entity.getId())
                .userEntity(entity.getUserEntity())
                .type(entity.getType())
                .token(entity.getToken())
                .createdAt(entity.getCreatedAt())
                .deletedAt(entity.getDeletedAt())
                .build();
    }
}
