package com.test.service;

import com.test.dao.PersonnelDao;
import com.test.entity.Leave;
import com.test.entity.Personnel;
import com.test.util.DataStore;
import org.springframework.data.annotation.ReadOnlyProperty;

import java.util.List;

public class PersonnelService {

    private PersonnelDao personnelDao = new PersonnelDao();

    public void save(Personnel personnel) {
        if (personnelDao == null) {
            personnelDao = new PersonnelDao(new DataStore());
        }
        personnelDao.add(personnel);
    }

    public List<Personnel> getAllPersonnel() {
        List<Personnel> personnelList = personnelDao.findAll();
        for (Personnel p : personnelList) {
            System.out.println(p);
        }
        return personnelList;
    }



    public Personnel getNationalCode(String nationalCode) {
        return personnelDao.findByNationalCode(nationalCode);
    }
}
