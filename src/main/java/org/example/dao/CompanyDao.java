package org.example.dao;

import org.example.etity.Company;


public interface CompanyDao {
    void createTables();

    void deleteById(Long id);

    void saveCompany(Company company);
}
