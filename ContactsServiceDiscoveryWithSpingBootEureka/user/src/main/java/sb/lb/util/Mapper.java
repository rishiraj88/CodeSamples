package sb.lb.util;

import sb.lb.entity.UserEntity;
import sb.lb.model.User;

public class Mapper {
    public static User entityToModel(UserEntity entity) {
        if (null == entity) return null;
        User model = new User();
        model.setUserId(entity.getUserId());
        model.setName(entity.getName());
        model.setPhone(entity.getPhone());
        model.setContacts(entity.getContacts());
        return model;
    }
}
