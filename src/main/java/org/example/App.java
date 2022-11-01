package org.example;

import org.example.dao.CarDao;
import org.example.dao.CompanyDao;
import org.example.dao.GarageDao;
import org.example.dao.PersonDao;
import org.example.daoImpl.CarDaoImpl;
import org.example.daoImpl.CompanyDaoImpl;
import org.example.daoImpl.GarageDaoImpl;
import org.example.daoImpl.PersonDaoImpl;
import org.example.etity.Car;
import org.example.etity.Company;
import org.example.etity.Garage;
import org.example.etity.Person;
import org.example.util.Util;

/**
 * Hello world!
 */

public class App {
    public static void main(String[] args) {
        Util.getSessionFactory();

        CompanyDao companyDao = new CompanyDaoImpl();
        PersonDao personDao = new PersonDaoImpl();
        CarDao carDao = new CarDaoImpl();
        GarageDao garageDao = new GarageDaoImpl();

        Company company = new Company("Ab", "Bishkek");
        Company company1 = new Company("Ad", "Osh");
        Company company2 = new Company("As", "Talas");
        companyDao.saveCompany(company);
        companyDao.saveCompany(company1);
        companyDao.saveCompany(company2);
//        companyDao.deleteById(1L);

        Person person = new Person("Abdu-Nuur", 17, "abdunuura@gmail", "male");
        Person person1 = new Person("Abdu", 71, "abdua@gmail", "male");
        Person person2 = new Person("Nuur", 11, "nuura@gmail", "male");
        personDao.savePerson(person);
        personDao.savePerson(person1);
        personDao.savePerson(person2);
//        personDao.deletePersonById(1L);

        Car car = new Car("juguli", "Kg");
        Car car1 = new Car("maskvich", "Kg");
        Car car2 = new Car("pasat", "Kg");
        carDao.saveCar(car);
        carDao.saveCar(car1);
        carDao.saveCar(car2);
//        carDao.saveCar(car);
//        carDao.deleteById(1L);

        Garage garage = new Garage("Garage", "");
        Garage garage1 = new Garage("Garage1", "");
        Garage garage2 = new Garage("Garage2", "");
        garageDao.saveGarage(garage);
        garageDao.saveGarage(garage1);
        garageDao.saveGarage(garage2);
//        garageDao.deleteById(1L);

    }
}