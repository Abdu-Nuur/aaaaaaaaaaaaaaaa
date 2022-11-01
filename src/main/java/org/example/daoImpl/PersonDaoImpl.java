package org.example.daoImpl;

import org.example.dao.PersonDao;
import org.example.etity.Person;
import org.example.util.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class PersonDaoImpl implements PersonDao {
    SessionFactory sessionFactory = Util.getSessionFactory();

    @Override
    public void createTables() {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.createSQLQuery("create table if not exists Person(" +
                    "id serial primary key," +
                    "name varchar(25) not null," +
                    "age int not null," +
                    "email varchar unique not null," +
                    "gender varchar not null)").executeUpdate();
            session.getTransaction().commit();
        }

    }

    @Override
    public void savePerson(Person person) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.persist(person);
            session.getTransaction().commit();
        }
    }

    @Override
    public void deletePersonById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Person person = session.get(Person.class, id);
            session.remove(person);
            session.getTransaction().commit();
        }
    }


}
