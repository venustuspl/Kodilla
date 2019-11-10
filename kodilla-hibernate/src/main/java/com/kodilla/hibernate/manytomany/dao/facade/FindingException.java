package com.kodilla.hibernate.manytomany.dao.facade;

public class FindingException extends Exception {

    public static String ERR_COMPANY_NOT_FOUND = "Company not found. ";
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee not found. ";

    public FindingException(String message) {
        super(message);
    }


}

