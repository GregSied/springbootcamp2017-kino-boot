package pl.sages.kodolamacz.cinema.dao.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sages.kodolamacz.cinema.dao.model.User;

/**
 * Created by acacko on 29.10.17
 */
@Repository
public interface UserDao extends JpaRepository<User, Long>, UserDaoCustom {

    User findByEmail(String email);


}
