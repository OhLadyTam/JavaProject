package dao;

import domen.Dokument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by DM on 1/27/2017.
 */
@Repository
public interface DokumentDao extends JpaRepository <Dokument, Long>{

    @Query("DELETE d FROM Dokument d WHERE d.Id=?1")
    void delete(Long id);
}
