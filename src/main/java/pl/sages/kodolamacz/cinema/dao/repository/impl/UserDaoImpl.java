package pl.sages.kodolamacz.cinema.dao.repository.impl;

import org.springframework.stereotype.Repository;
import pl.sages.kodolamacz.cinema.dao.model.User;
import pl.sages.kodolamacz.cinema.dao.repository.UserDaoCustom;

import java.util.List;

/**
 * Created by acacko on 05.11.17
 */
@Repository
public class UserDaoImpl extends AbstractDaoImpl<User> implements UserDaoCustom {

    public UserDaoImpl() {
        setClazz(User.class);
    }

    @Override
    public User findByPaaasword(String password) {
        return entityManager.createQuery("from " + clazz.getName() + " where password = :password", clazz)
                .setParameter("password", password)
                .getSingleResult();
    }


    // propozycja Pawła (jako optymalizacja zapytania SQL)
    @Override
    public List<User> findUsersFetchResevation() {
        return entityManager.createQuery("select u from " + clazz.getName() + " u left join fetch u.reservations", clazz)
            .getResultList();
    }

}
