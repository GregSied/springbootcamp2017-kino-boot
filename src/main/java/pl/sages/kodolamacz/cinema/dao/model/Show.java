package pl.sages.kodolamacz.cinema.dao.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by acacko on 29.10.17
 */
@Entity
@Table(name = "shows")
public class Show extends AbstractEntity {

    private Date date;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id")
    private Room room;

    public Show() {}

    public Show(Date date, Movie movie, Room room) {
        this.date = date;
        this.movie = movie;
        this.room = room;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
