package akbarmd.java.maintenance.restful.controler;

import akbarmd.java.maintenance.restful.entity.User;
import akbarmd.java.maintenance.restful.model.CreateRequestUser;
import akbarmd.java.maintenance.restful.model.UserRespose;
import akbarmd.java.maintenance.restful.model.WebResponse;
import akbarmd.java.maintenance.restful.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UserController {

    UserService userService;

    @PostMapping(value = "users")
    public WebResponse<UserRespose> createUser(@RequestBody CreateRequestUser body) {
        UserRespose userRespose = userService.create(body);
        return new WebResponse<>(
                200,
                "OK",
                userRespose
        );
    }

    @GetMapping(value = "hello")
    public String hello() {
        return "Hello world";
    }

    @GetMapping(value = "getAllUsers")
    public WebResponse<List<User>> getUsers() {
        List<User> users = userService.getAllUser();
        return new WebResponse<List<User>>(200,"OK",users);
    }

    @PostMapping(params = "id", path = "findUser")
    public WebResponse<UserRespose> response(@Param("id") String id) {
        Optional<User> user = userService.findUser(id);
        return new WebResponse<UserRespose>(
                200,
                "OK",
                new UserRespose(
                        user.get().getIdUser(),
                        user.get().getEmail(),
                        user.get().getPassword(),
                        user.get().getLevelUser(),
                        user.get().getStatus()
                )
        );
    }

}
