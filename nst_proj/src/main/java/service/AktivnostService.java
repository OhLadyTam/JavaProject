package service;

import domen.Aktivnost;

import java.util.List;

/**
 * Created by DM on 1/27/2017.
 */
public interface AktivnostService {

    List<Aktivnost> findAll();

    void delete(Long id);

    Aktivnost save(Aktivnost aktivnost);
}
