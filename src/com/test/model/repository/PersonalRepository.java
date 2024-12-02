package com.test.model.repository;

import com.test.entity.Personnel;

import java.util.ArrayList;
import java.util.List;

public class PersonalRepository {

    private List<Personnel> personalList = new ArrayList<>();

    // Add a new Personal
    public void add(Personnel personal) {
        personalList.add(personal);
    }

    // Update
    public void update(Personnel personal) {
        for (int i = 0; i < personalList.size(); i++) {
            if (personalList.get(i).getId() == personal.getId()) {
                personalList.set(i, personal);
                return;
            }
        }
    }

    // Get the list of all Personal
    public List<Personnel> getPersonalList() {
        return personalList;
    }

    // Delete a Personal
    public void delete(Personnel personal) {
        personalList.remove(personal);
    }

    // Find a Personal by ID
    public Personnel findById(int id) {
        for (Personnel personal : personalList) {
            if (personal.getId() == id) {
                return personal;
            }
        }
        return null;
    }

    public List<Personnel> findAll() {
        return personalList;
    }
}
