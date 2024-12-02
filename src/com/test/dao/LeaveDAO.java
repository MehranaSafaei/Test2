package com.test.dao;

import com.test.entity.Leave;
import com.test.entity.Personnel;
import com.test.util.DataStore;

import java.util.ArrayList;
import java.util.List;

public class LeaveDAO {

    private DataStore  dataStore = new DataStore();

    public void addLeave(Leave leave, Personnel personnel) {
        dataStore.addLeave(leave, personnel);
    }


//    public List<Leave> getLeavesByPersonnel(Personnel personnel) {
//        return dataStore.findLeavesByPersonnel(personnel);
//
//    }
}
