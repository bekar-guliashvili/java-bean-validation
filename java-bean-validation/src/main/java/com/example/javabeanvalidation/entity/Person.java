package com.example.javabeanvalidation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    //@NotNull is valid as long as is not null
    @NotNull(message = "Name can't be null")
    //@NotEmpty is valid as long as is not null, and it's size is grater than zero
    @NotEmpty(message = "Name can't be empty")
    //@NotBlank is valid as long as is not null, and it's trimmed size is grater than zero
    @NotBlank(message = "Name can't be Blank")
    @Size(min = 2, max = 32, message = "Name must be between 2 and 32 characters long")
    private String name;

    @NotNull(message = "Email is required")
    @Email(message = "Email must be a valid email address")
    private String email;

    @NotNull(message = "Mobile number is required")
    @Pattern(regexp = "^\\d{10}$", message = "invalid mobile number entered")
    private String mobile;

    @Min(value = 18, message = "Age Must be at least 18")
    @Max(value = 99, message = "Age must be less than 100")
    private int age;

    @DecimalMin(value = "100", message = "Height must be at least 150 cm")
    @DecimalMax(value = "200", message = "Height must not exceed 200 cm")
    private double height;






}
