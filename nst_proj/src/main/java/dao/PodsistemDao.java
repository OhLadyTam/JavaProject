package dao;

import domen.Podsistem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by DM on 1/27/2017.
 */
@Repository
public interface PodsistemDao extends JpaRepository <Podsistem, Long> {

    @Query("DELETE p FROM Podsistem p WHERE p.Id=?1")
    void delete(Long id);

}
