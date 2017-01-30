package service;

import domen.Proces;

import java.util.List;

/**
 * Created by DM on 1/27/2017.
 */
public interface ProcesService {

    List<Proces> findAll();

    void delete(Long id);

    Proces save(Proces proces);
}
