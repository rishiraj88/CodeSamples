package sb.lb.service;

import org.springframework.stereotype.Service;
import sb.lb.dto.UserDto;
import sb.lb.entity.UserEntity;
import sb.lb.util.Mapper;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    List<UserEntity> list = List.of(
                new UserEntity(2021L,"Rishi Raj", "2342342"),
            new UserEntity(2022L,"Maikel", "78978798"),
            new UserEntity(2024L,"Alex", "56161561")
            );

    @Override
    public UserDto getUser(Long id) {
        UserEntity userEntity = list.stream().filter(u -> u.getUserId().equals(id)).findAny().orElse(null);

        UserDto userDto = Mapper.entityToDto(userEntity);
        return userDto;
    }
}