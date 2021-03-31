package com.brunalima.bookstoremanager.entity;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import jdk.jfr.DataAmount;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer age;
}
