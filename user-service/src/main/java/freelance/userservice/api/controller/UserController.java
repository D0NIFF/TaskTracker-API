package freelance.userservice.api.controller;

import freelance.userservice.api.DTO.UserDTO;
import freelance.userservice.api.factory.UserDTOFactory;
import freelance.userservice.store.entity.UserEntity;
import freelance.userservice.store.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<UserDTO> getUser()
    {
        return userRepository.findAll()
                .stream()
                .map(UserDTOFactory::makeDTO)
                .collect(Collectors.toList());
    }

    @PostMapping
    public UserDTO createUser(
            @RequestParam String login,
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String avatar,
            @RequestParam String seoSource
    )
    {
        UserEntity userEntity = new UserEntity();
        userEntity.setLogin(login);
        userEntity.setEmail(email);
        userEntity.setPassword(password);
        userEntity.setAvatar(avatar);
        userEntity.setSeoSource(seoSource);
        return UserDTOFactory.makeDTO(userRepository.saveAndFlush(userEntity));
    }
}
