package com.samcro.springCourse.Models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
    private String firstName;
    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    @Size(max = 5, message = "most 5 chars.")
    private String lastName;
    private String country;

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

}
 