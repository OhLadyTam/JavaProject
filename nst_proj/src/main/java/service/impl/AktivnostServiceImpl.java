package service.impl;

import dao.AktivnostDao;
import domen.Aktivnost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.AktivnostService;

import java.util.List;

/**
 * Created by DM on 1/27/2017.
 */
@Service
public class AktivnostServiceImpl implements AktivnostService {

    @Autowired
    private AktivnostDao aktivnostDao;

    @Override
    public List<Aktivnost> findAll() {
        return aktivnostDao.findAll();
    }

    @Override
    public void delete(Long id) {
        aktivnostDao.delete(id);
    }

    @Override
    public Aktivnost save(Aktivnost aktivnost) {
        return aktivnostDao.save(aktivnost);
    }

}
