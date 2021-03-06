package pharmacy.Services;

import pharmacy.DAO.PharmacyDAO;
import pharmacy.Models.Pharmacy;

import java.util.List;

/**
 * Created by User on 20.09.2016.
 */
public class PharmacyService {
    PharmacyDAO dao;

    public PharmacyService() {
        dao = new PharmacyDAO();
    }

    public List getAll() {
       List list = dao.getAll();
        return list;
    }

    public List getAllForNetwork(int id) {
        List list = dao.getAllForNetwork(id);
        System.out.println("list size: " + list.size());
        return list;
    }

    public int deleteById(int id) {
        return dao.deleteById(id);
    }

    public Pharmacy getById(int id) {
        return dao.getById(id);
    }

    public int update(Pharmacy obj) {
        return dao.update(obj);
    }

    public Pharmacy getByPhId(int id) {return dao.getByPhId(id);}

    public void insert(Pharmacy obj) {
        dao.insert(obj);
    }
}
