package Mock.Database;

import lombok.Data;

import javax.persistence.*;

@Data
@Table
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;
    private String surName;

    @Column(unique = true)
    private String email;
}
