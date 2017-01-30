package dao;

import domen.Proces;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by DM on 1/27/2017.
 */
@Repository
public interface ProcesDao extends JpaRepository <Proces, Long> {

    @Query("DELETE p FROM Proces p WHERE p.Id=?1")
    void delete(Long id);

}
