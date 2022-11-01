package org.example.daoImpl;

import org.example.dao.CompanyDao;
import org.example.etity.Company;
import org.example.util.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class CompanyDaoImpl implements CompanyDao {
    SessionFactory sessionFactory = Util.getSessionFactory();

    @Override
    public void createTables() {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.createSQLQuery("create table if not exists Company(" +
                    "id serial primary key," +
                    "companyName varchar(30) unique not null," +
                    "locaition varchar not null)").executeUpdate();
            session.getTransaction().commit();
        }
    }

    @Override
    public void deleteById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Company company = session.get(Company.class, id);
            session.remove(company);
            session.getTransaction().commit();
        }
    }

    @Override
    public void saveCompany(Company company) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.persist(company);
            session.getTransaction().commit();
        }
    }
}
