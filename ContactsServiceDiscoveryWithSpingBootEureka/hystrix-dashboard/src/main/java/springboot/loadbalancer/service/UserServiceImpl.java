package springboot.loadbalancer.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import springboot.loadbalancer.entity.User;

import java.util.List;

import javax.net.ssl.HttpsURLConnection;

@Service
public class UserServiceImpl implements UserService {

    List<User> list = List.of(
                new User(2021L,"Rishi Raj", "2342342"),
            new User(2022L,"Maikel", "78978798"),
            new User(2024L,"Alex", "56161561")
            );

    @Override
    public User getUser(Long id) {
        User user = list.stream().filter(u -> u.getUserId().equals(id)).findAny().orElse(null);
        return user;
    }
}