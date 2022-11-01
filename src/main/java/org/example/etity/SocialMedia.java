package org.example.etity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class SocialMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String socialMedia;

    @ManyToMany(cascade = ALL,fetch = FetchType.LAZY)
    private List<Person> persons = new ArrayList<>();

    public SocialMedia(String socialMedia) {
        this.socialMedia = socialMedia;
    }

    @Override
    public String toString() {
        return "SocialMedia{" +
                "id=" + id +
                ", socialMedia='" + socialMedia + '\'' +
                '}';
    }
}
