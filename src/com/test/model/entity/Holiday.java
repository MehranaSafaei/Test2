package com.test.model.entity;

import com.test.entity.Personnel;

import java.time.LocalDate;

public class Holiday {

    private static int idCounter = 0;
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    //@ManyToOne
    private Personnel personnel;

    public Holiday() {
        this.id= (long) idCounter++;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }

    public Personnel getPersonnel() {
        return personnel;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", personnel=" + personnel +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "Holiday{name='" + personal + "', date=" + date + "', date=" + endDate + "}";
//    }

    //    @Override
//    public String toString() {
//        return "Holiday{" +
//                "startDate=" + startDate +
//                ", endDate=" + endDate +
//                ", personal=" + personal.getId() + " (" + personal.getId() + ")" +
//                '}';
//    }
}

//    public static void addHoliday(Scanner scanner) {
//        System.out.println("com.test.Holiday");
//
//        System.out.print("Enter start date (YYYY-MM-DD): ");
//        LocalDate startDate = LocalDate.parse(scanner.nextLine());
//        scanner.nextLine();
//
//        System.out.print("Enter end date (YYYY-MM-DD): ");
//        LocalDate date = LocalDate.parse(scanner.nextLine());
//
//
//    }
//
//    @Override
//    public String toString() {
//        return "Holiday{" +
//                "startDate=" + startDate +
//                ", endDate=" + endDate +
//                '}';
//    }
//}