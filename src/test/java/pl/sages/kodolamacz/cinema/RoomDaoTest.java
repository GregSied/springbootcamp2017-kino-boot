package pl.sages.kodolamacz.cinema;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;
import pl.sages.kodolamacz.cinema.dao.model.Room;
import pl.sages.kodolamacz.cinema.dao.repository.RoomDao;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoomDaoTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private RoomDao roomDao;

    private Room room;

    @Before
    public void init() {
        room = new Room(51, 666);
        roomDao.save(room);
        // tutaj inicjujemy start testów (kontekst testu)
    }

    @Test
    public void simpleFindTest() {
        assertThat(roomDao.findAll()).isNotEmpty();
    }

    @Test
    public void findByCapacityTest() {
        assertThat(roomDao.findByCapacity(666)).isNotNull();
        assertThat(roomDao.findByCapacity(666).getNumber()).isEqualTo(51);

        //assertThat(roomDao.findByEmail("email@pl")).isNotNull();
        //assertThat(userDao.findByEmail("email@pl").getEmail()).isEqualTo("email@pl");
    }

    @Test
    public void findByNumberTest() {
        assertThat(roomDao.findByNumber(51).getCapacity()).isEqualTo(666);
        //assertThat(userDao.findByPaaasword("pass")).isNotNull();
    }


    @Test
    public void saveTest() {
        long countBefore = roomDao.count();
        Room room = new Room(52, 200);
        roomDao.save(room);
        assertThat(room).isNotNull();
        assertThat(room.getId()).isNotNull();

        long countAfter = roomDao.count();

        assertThat(countBefore).isLessThan(countAfter);
        assertThat(countBefore).isEqualTo(countAfter - 1);

    }

    @Test
    public void deleteTest() {

        long countBefore = roomDao.count();

        Room one = roomDao.findOne(room.getId());
        roomDao.delete(one);

        // tożsame z :
        //userDao.delete(one.getId());

        long countAfter = roomDao.count();
        assertThat(countBefore).isGreaterThan(countAfter);

        assertThat(roomDao.findOne(room.getId())).isNull();

    }


}
