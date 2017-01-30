package service;

import domen.Dokument;

import java.util.List;

/**
 * Created by DM on 1/27/2017.
 */
public interface DokumentService {

    List<Dokument> findAll();

    void delete(Long id);

    Dokument save(Dokument dokument);
}
