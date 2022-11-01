package org.example.dao;

import org.example.etity.SocialMedia;


public interface SocialMediaDao {
    void createTables();

    void deleteById(Long id);

    void saveSocialMedia(SocialMedia socialMedia);
}
