package pl.sages.kodolamacz.cinema.dao.repository;


import pl.sages.kodolamacz.cinema.dao.model.AbstractEntity;

/**
 * Created by acacko on 29.10.17
 */
public interface AbstractDao<T extends AbstractEntity> {

    T findById(Long id);


}
