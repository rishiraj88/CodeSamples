package springboot.loadbalancer.service;

import springboot.loadbalancer.entity.User;

public interface UserService {

    public abstract User getUser(Long id);

}
