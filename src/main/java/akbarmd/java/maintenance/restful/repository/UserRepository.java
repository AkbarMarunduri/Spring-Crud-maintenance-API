package akbarmd.java.maintenance.restful.repository;

import akbarmd.java.maintenance.restful.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
