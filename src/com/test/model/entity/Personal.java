//package com.test.model.entity;
//
//import java.util.List;
//
//public class Personal {
//    private static int idCounter = 0;
//    private Long id;
//    private String username;
//    private String email;
//    private String nationalCode;
//    //@OneToMany
//    private List<Holiday> holiday;
//
//
//    public Personal() {
//            this.id = (long) idCounter++;
//        }
//
////    public Personal(List<Holiday> holiday) {
////        this.holiday = holiday;
////    }
//
//    public Long getId() {
//        return id;
//    }
//
//
//    public void setId(Long id) {
//        this.id = this.id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getNationalCode() {
//        return nationalCode;
//    }
//
//    public void setNationalCode(String nationalCode) {
//        this.nationalCode = nationalCode;
//    }
//
//    public Holiday getHoliday() {
//        return (Holiday) holiday;
//    }
//
//    public void setHoliday(Holiday holiday) {
//        this.holiday = (List<Holiday>) holiday;
//    }
//
//    @Override
//    public String toString() {
//        return "Personal{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", email='" + email + '\'' +
//                ", nationalCode='" + nationalCode + '\'' +
//                ", holiday=" + holiday +
//                '}';
//    }
//
//
//}
//
//
//
