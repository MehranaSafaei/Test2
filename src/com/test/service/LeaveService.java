    package com.test.service;

    import com.test.dao.LeaveDAO;
    import com.test.dao.PersonnelDao;
    import com.test.entity.Leave;
    import com.test.entity.Personnel;

    import java.util.List;

    public class LeaveService {

        private final LeaveDAO leaveDAO = new LeaveDAO();
        private final PersonnelDao personnelDao = new PersonnelDao();


        public void saveLeave(Leave leave, Personnel personnel) {
            leaveDAO.addLeave(leave, personnel);
        }

//        public List<Leave> getAllLeave(Personnel personnel) {
//            return leaveDAO.getLeavesByPersonnel(personnel);
//        }
       /* public void saveLeave(Leave leave, Personnel personnel) {
            Personnel personnel1 = personnelDao.findByNationalCode(personnel.getNationalCode());
            if (personnel1 == null) {
                System.out.println("NationalCode not found.");
            } else {
                leave.setPersonnel(personnel1);
                leaveDAO.addLeave(leave, personnel1);
            } */

    }
