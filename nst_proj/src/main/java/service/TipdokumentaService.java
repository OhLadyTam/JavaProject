package service;

import domen.Tipdokumenta;

import java.util.List;

/**
 * Created by DM on 1/27/2017.
 */
public interface TipdokumentaService {

    List<Tipdokumenta> findAll();

    void delete(Long id);

    Tipdokumenta save(Tipdokumenta aktivnost);
}
