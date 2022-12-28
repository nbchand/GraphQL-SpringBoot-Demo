package com.nabin.graphqlpractice.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-12-27
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Author {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String thumbnail;
}
