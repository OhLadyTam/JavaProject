package service.impl;

import dao.ProcesDao;
import domen.Proces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ProcesService;

import java.util.List;

/**
 * Created by DM on 1/27/2017.
 */
@Service
public class ProcesServiceImpl implements ProcesService {

    @Autowired
    private ProcesDao procesDao;

    @Override
    public List<Proces> findAll() {
        return procesDao.findAll();
    }

    @Override
    public void delete(Long id) {
        procesDao.delete(id);
    }

    @Override
    public Proces save(Proces proces) {
        return procesDao.save(proces);
    }

}
