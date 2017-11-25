package pl.sages.kodolamacz.cinema.dao.repository;


import pl.sages.kodolamacz.cinema.dao.model.User;

import java.util.List;

/**
 * Created by acacko on 05.11.17
 */
public interface UserDaoCustom {

    User findByPaaasword(String password);

    List<User> findUsersFetchResevation();

}
