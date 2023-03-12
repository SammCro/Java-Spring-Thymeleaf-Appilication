package com.samcro.springCourse.Models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.samcro.springCourse.CustomValidators.CourseCode;

@Entity
@Table(name = "student")
public class Student {
    @NotNull
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name")
    @NotNull(message = "is required")
    private String firstName;
    
    @Column(name = "last_name")
    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    @Size(max = 5, message = "most 5 chars.")
    private String lastName;
    
    // private String country;
    
    // @NotNull(message="is required")
    // @Max(value = 10, message = "must be less than 10")
    // @Min(value = 0, message = "must be equal or bigger than 0")
    // private Integer age;

    @Column(name = "email")
    @Pattern(regexp = "^(.+)@(.+)$", message ="you have enter a valid email")
    private String email;

    // @CourseCode(value = {"SAM","YAS"}, message = "must start with SAM")
    // private String courseCode;

    // default constructor
    public Student(){};

    // constructor with fields
    public Student(Integer id, String firstName, String lastName, String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // getters and setters
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
    // public String getCountry(){
    //     return this.country;
    // }
    // public void setCountry(String country){
    //     this.country = country;
    // }

    // public Integer getAge(){
    //     return this.age;
    // }

    // public void setAge(Integer age){
    //     this.age = age;
    // }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    // public String getCourseCode(){
    //     return this.courseCode;
    // }
    
    // public void setCourseCode(String courseCode){
    //     this.courseCode = courseCode;
    // }
    
    @Override
    public String toString(){
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
    }

}
 