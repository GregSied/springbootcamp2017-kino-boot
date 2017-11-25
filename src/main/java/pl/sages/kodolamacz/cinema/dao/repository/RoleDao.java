package pl.sages.kodolamacz.cinema.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sages.kodolamacz.cinema.dao.model.Role;

/**
 * Created by acacko on 29.10.17
 */
@Repository
public interface RoleDao extends JpaRepository<Role, Long> {

//    Room findByCapacity(int number);
//
//    Room findByNumber(int number);

}
