package dao;

import domen.Tipdokumenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by DM on 1/27/2017.
 */
@Repository
public interface TipdokumentaDao extends JpaRepository <Tipdokumenta, Long> {

    @Query("DELETE t FROM Tipdokumenta t WHERE t.Id=?1")
    void delete(Long id);

}
