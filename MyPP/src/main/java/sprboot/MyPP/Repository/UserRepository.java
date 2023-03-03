package sprboot.MyPP.Repository;

import sprboot.MyPP.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Integer> {
}
