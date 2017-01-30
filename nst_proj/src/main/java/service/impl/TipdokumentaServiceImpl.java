package service.impl;

import dao.TipdokumentaDao;
import domen.Tipdokumenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.TipdokumentaService;

import java.util.List;

/**
 * Created by DM on 1/27/2017.
 */
@Service
public class TipdokumentaServiceImpl implements TipdokumentaService {

    @Autowired
    private TipdokumentaDao tipdokumentaDao;

    @Override
    public List<Tipdokumenta> findAll() {
        return tipdokumentaDao.findAll();
    }

    @Override
    public void delete(Long id) {
        tipdokumentaDao.delete(id);
    }

    @Override
    public Tipdokumenta save(Tipdokumenta tipdokumenta) {
        return tipdokumentaDao.save(tipdokumenta);
    }

}
