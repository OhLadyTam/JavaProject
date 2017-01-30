package service;

import domen.Podsistem;

import java.util.List;

/**
 * Created by DM on 1/27/2017.
 */
public interface PodsistemService {

    List<Podsistem> findAll();

    void delete(Long id);

    Podsistem save(Podsistem podsistem);
}
