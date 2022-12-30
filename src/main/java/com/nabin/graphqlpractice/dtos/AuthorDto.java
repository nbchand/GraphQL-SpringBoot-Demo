package com.nabin.graphqlpractice.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-12-30
 */
@Getter
@Setter
public class AuthorDto {
    @NotEmpty
    @Pattern(regexp = "^[A-Za-z]{1,20}$", message = "Invalid name")
    private String name;
    private String thumbnail;
}
