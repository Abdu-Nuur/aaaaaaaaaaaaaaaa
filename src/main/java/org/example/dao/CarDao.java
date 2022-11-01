package org.example.dao;

import org.example.etity.Car;

public interface CarDao {
    void createTables();

    void deleteById(Long id);

    void saveCar(Car car);

}
