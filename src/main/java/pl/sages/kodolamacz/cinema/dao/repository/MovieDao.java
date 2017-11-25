package pl.sages.kodolamacz.cinema.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sages.kodolamacz.cinema.dao.model.Movie;


/**
 * Created by acacko on 29.10.17
 */
public interface MovieDao extends JpaRepository<Movie, Long> {

    Movie findByTitle(String title);

    Movie findByPrice(int price);
}
