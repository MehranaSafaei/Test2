//package com.test.model.service;
//
//import com.test.entity.Personnel;
//import com.test.model.entity.Holiday;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//
//public class HolidayService {
//
//    static Map<Personnel, List<Holiday>> holidayMap = new HashMap<>();
//
//
//    public static LocalDate addDate() {
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        return LocalDate.parse(str, dtf);
//    }
//    public static Holiday addHoliday(Scanner scanner, Personnel personnel) {
//        System.out.println("Registering new holiday:");
//
//        System.out.print("star date (dd-MM-yyyy: )");
//        LocalDate startDate = addDate();
//        scanner.nextLine();
//
//        System.out.print("end date (dd-MM-yyyy: )");
//        LocalDate endDate = addDate();
//
//        Holiday holiday = new Holiday();
//        holiday.setStartDate(startDate);
//        holiday.setEndDate(endDate);
//        holiday.setPersonnel(personnel);
////        holidayMap.get(personal).add(holiday);
//        System.out.println("holiday register: " + holiday);
//        return holiday;
//    }
//}
//
