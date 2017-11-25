package pl.sages.kodolamacz.cinema.dao.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import pl.sages.kodolamacz.cinema.dao.model.AbstractEntity;
import pl.sages.kodolamacz.cinema.dao.repository.AbstractDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by acacko on 29.10.17
 */
public abstract class AbstractDaoImpl<T extends AbstractEntity> implements AbstractDao<T> {

    @PersistenceContext
    protected EntityManager entityManager;

    protected Class<T> clazz;

    public void setClazz(Class<T> clazz) {
        this.clazz = clazz;
    }

    public Class<T> getClazz() {
        return clazz;
    }

    Map<Long, T> entityMap = new HashMap<>();

    public T findById(Long id) {
        return entityMap.get(id);
//        return entityManager.find(clazz, id);
    }

    public List<T> findAll() {
        // zapytanie o wiele
        return entityManager
                .createQuery("from " + clazz.getName(), clazz)
                .getResultList();
    }
}
