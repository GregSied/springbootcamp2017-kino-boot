package pl.sages.kodolamacz.cinema.dao.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
* Created by acacko on 29.10.17
 */

@Entity
@Table(name = "movies")
public class Movie extends AbstractEntity {

    private String title;
    private int price; // in grosze

    public Movie() {}

    public Movie(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
