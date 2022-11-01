package org.example.etity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    private String email;

    private String gender;

    @ManyToOne(cascade = {DETACH,REFRESH,MERGE,PERSIST},fetch = FetchType.LAZY)
    private Company compnanies;

    @OneToMany(cascade = ALL,fetch = FetchType.EAGER,mappedBy = "persons")
    private List<Car> cars;

    public Person(String name, int age, String email, String gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

