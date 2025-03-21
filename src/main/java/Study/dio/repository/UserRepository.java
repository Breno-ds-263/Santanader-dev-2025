package Study.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Study.dio.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
