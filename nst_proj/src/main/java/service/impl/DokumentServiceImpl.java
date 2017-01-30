package service.impl;


import dao.DokumentDao;
import domen.Dokument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.DokumentService;

import java.util.List;

/**
 * Created by DM on 1/27/2017.
 */
@Service
public class DokumentServiceImpl implements DokumentService {

    @Autowired
    private DokumentDao dokumentDao;

    @Override
    public List<Dokument> findAll() {
        return dokumentDao.findAll();
    }

    @Override
    public void delete(Long id) {
        dokumentDao.delete(id);
    }

    @Override
    public Dokument save(Dokument dokument) {
        return dokumentDao.save(dokument);
    }
}
