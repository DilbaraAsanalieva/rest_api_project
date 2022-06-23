package peaksoft.rest_api_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.rest_api_project.entity.User;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);


}
