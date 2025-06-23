package sb.lb.service;

import sb.lb.dto.UserDto;

public interface UserService {

    public abstract UserDto getUser(Long id);

}
