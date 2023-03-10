package com.samcro.springCourse.Models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
    private String firstName;
    
    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    @Size(max = 5, message = "most 5 chars.")
    private String lastName;
    
    private String country;
    
    @NotNull(message="is required")
    @Max(value = 10, message = "must be less than 10")
    @Min(value = 0, message = "must be equal or bigger than 0")
    private Integer age;

    @Pattern(regexp = "^(.+)@(.+)$", message ="you have enter a valid email")
    private String email;

    public Student(){};

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //TODO: remove the unnecessary getter and setter methods.
    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

}
 