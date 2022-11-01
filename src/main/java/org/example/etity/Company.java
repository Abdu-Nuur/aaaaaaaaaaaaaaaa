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
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;

    private String location;

    @OneToMany(cascade = ALL,fetch = FetchType.EAGER)
    private List<Person> person = new ArrayList<>();

    public Company(String companyName, String location) {
        this.companyName = companyName;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

