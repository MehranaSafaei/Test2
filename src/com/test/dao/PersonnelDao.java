package com.test.dao;

import com.test.entity.Personnel;
import com.test.util.DataStore;

import java.util.List;

public class PersonnelDao{


    private DataStore dataStore;

    public PersonnelDao(DataStore dataStore) {
        this.dataStore = new DataStore();
    }

    public PersonnelDao() {
        this.dataStore = new DataStore();
    }


    public void add(Personnel personnel) {
        dataStore.addPersonnel(personnel);
    }

    public List<Personnel> findAll() {
        return dataStore.findAll();
    }

    public Personnel findByNationalCode(String nationalCode) {
        return dataStore.findByNationalCode(nationalCode);
    }


//    public Personnel findByUserName(String userName) {
//        return dataStore.findByUserName(userName);
//    }


}











