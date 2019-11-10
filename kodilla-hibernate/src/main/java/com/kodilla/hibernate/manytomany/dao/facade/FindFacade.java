package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindFacade {

    boolean wasError = false;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyDao.class);

    public List<Company> findingCompanyProccesor(String letters) throws FindingException {
        try {
            List<Company> result = companyDao.CompaniesByAnyLetters(letters);
            LOGGER.info("Company founded.");

            if (result.size() == 0) {
                wasError = true;
                LOGGER.error(FindingException.ERR_COMPANY_NOT_FOUND);
                throw new FindingException(FindingException.ERR_COMPANY_NOT_FOUND);
            }

//            result.stream()
//                    .map(o -> o.getName())
//                    .forEach(System.out::println);

            return result;
        } finally {
            if (wasError) {
                LOGGER.info("Wyszukiwanie nieudane. ");
            }
        }
    }


    public List<Employee> findingEmployeeProccesor(String letters) throws FindingException {
        try {
            List<Employee> result = employeeDao.EmployeeByAnyLettersFromLastname(letters);
            LOGGER.info("Employee founded.");

            if (result.size() == 0) {
                wasError = true;
                LOGGER.error(FindingException.ERR_EMPLOYEE_NOT_FOUND);
                throw new FindingException(FindingException.ERR_EMPLOYEE_NOT_FOUND);
            }

            return result;
        } finally {
            if (wasError) {
                LOGGER.info("Wyszukiwanie nieudane. ");
            }


        }
    }


}
