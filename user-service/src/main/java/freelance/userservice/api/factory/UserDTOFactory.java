package freelance.userservice.api.factory;

import freelance.userservice.api.DTO.UserDTO;
import freelance.userservice.store.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserDTOFactory {

    public static UserDTO makeDTO(UserEntity entity)
    {
        return UserDTO.builder()
                .id(entity.getId())
                .login(entity.getLogin())
                .email(entity.getEmail())
                //.password(entity.getPassword())
                .avatar(entity.getAvatar())
                //.balance(entity.getBalance())
                //.registerIp(entity.getRegisterIp())
                .rating(entity.getRating())
                //.seoSource(entity.getSeoSource())
                //.verifiedAt(entity.getVerifiedAt())
                //.createdAt(entity.getCreatedAt())
                //.updatedAt(entity.getUpdatedAt())
                //.deletedAt(entity.getDeletedAt())
                .build();
    }
}
