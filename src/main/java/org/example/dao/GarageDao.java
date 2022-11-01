package org.example.dao;

import org.example.etity.Garage;


public interface GarageDao {
    void createTables();

    void deleteById(Long id);

    void saveGarage(Garage garage);
}
