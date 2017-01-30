package service.impl;

import dao.PodsistemDao;
import domen.Podsistem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.PodsistemService;

import java.util.List;

/**
 * Created by DM on 1/27/2017.
 */
@Service
public class PodsistemServiceImpl implements PodsistemService{

    @Autowired
    private PodsistemDao podsistemDao;

    @Override
    public List<Podsistem> findAll() {
        return podsistemDao.findAll();
    }

    @Override
    public void delete(Long id) {
        podsistemDao.delete(id);
    }

    @Override
    public Podsistem save(Podsistem podsistem) {
        return podsistemDao.save(podsistem);
    }

}
