package akbarmd.java.maintenance.restful.service;

import akbarmd.java.maintenance.restful.entity.User;
import akbarmd.java.maintenance.restful.model.CreateRequestUser;
import akbarmd.java.maintenance.restful.model.UserRespose;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UserService {
    UserRespose create(CreateRequestUser user);

    List<User> getAllUser();

    Optional<User> findUser(String id);
}


