package sb.lb.service;

import org.springframework.stereotype.Service;
import sb.lb.entity.UserEntity;
import sb.lb.model.User;
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
    public User getUser(Long id) {
        UserEntity entity = list.stream().filter(u -> u.getUserId().equals(id)).findAny().orElse(null);

        User model = Mapper.entityToModel(entity);
        return model;
    }
}