package sb.lb.util;

import sb.lb.dto.UserDto;
import sb.lb.entity.UserEntity;

public class Mapper {
    public static UserDto entityToDto(UserEntity userEntity) {
        if (null == userEntity) return null;
        UserDto userDto= new UserDto();
        userDto.setUserId(userEntity.getUserId());
        userDto.setName(userEntity.getName());
        userDto.setPhone(userEntity.getPhone());
        userDto.setContacts(userEntity.getContacts());
        return userDto;
    }
}
