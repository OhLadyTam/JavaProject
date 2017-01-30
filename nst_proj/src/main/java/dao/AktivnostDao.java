package dao;

import domen.Aktivnost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by DM on 1/27/2017.
 */
@Repository
public interface AktivnostDao extends JpaRepository<Aktivnost, Long> {

    @Query("DELETE a FROM Aktivnost a WHERE a.Id=?1")
    void delete(Long id);
}
