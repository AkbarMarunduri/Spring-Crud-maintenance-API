package akbarmd.java.maintenance.restful.service.impl;

import akbarmd.java.maintenance.restful.entity.User;
import akbarmd.java.maintenance.restful.model.CreateRequestUser;
import akbarmd.java.maintenance.restful.model.UserRespose;
import akbarmd.java.maintenance.restful.repository.UserRepository;
import akbarmd.java.maintenance.restful.service.UserService;
import akbarmd.java.maintenance.restful.validation.ValidationUtil;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    ValidationUtil validationUtil;

    @Override
    public UserRespose create(CreateRequestUser requestUser) {

        validationUtil.validate(requestUser);
        User user = new User();
        user.setIdUser(requestUser.getId());
        user.setEmail(requestUser.getEmail());
        user.setStatus(requestUser.getStatus());

        userRepository.save(user);

        return new UserRespose(
                user.getIdUser(),
                user.getEmail(),
                null,
                null,
                "0"
        );
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findUser(String id) {
        return userRepository.findById(id);
    }


}
