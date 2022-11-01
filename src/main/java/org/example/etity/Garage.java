package org.example.etity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Garage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String isEmpty;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Car cars;


    public Garage(String name, String isEmpty) {
        this.name = name;
        this.isEmpty = isEmpty;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isEmpty='" + isEmpty + '\'' +
                '}';
    }
}
