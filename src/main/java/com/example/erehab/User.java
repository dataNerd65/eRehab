package com.example.erehab;

import javax.persistence.*;

@Entity
@Table(name = "eRehabUsers")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fullname", nullable = false)
    private String fullname;

    @Column(name= "email", nullable = false, unique = true)
    private String email;

    @Column(name="phone_number", nullable = false)
    private String phone_number;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name ="password", nullable = false)
    private String password;

    public User(){
        //Default constructor for JPA
    }

    public User(String fullname, String email, String phone_number, String username, String password){
        this.fullname = fullname;
        this.email = email;
        this.phone_number = phone_number;
        this.username = username;
        this.password = password;
    }

    //Getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFullname(){
        return fullname;
    }
    public void setFullname(String fullname){
        this.fullname = fullname;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone_number(){
        return phone_number;
    }
    public void setPhone_number(String phone_number){
        this.phone_number = phone_number;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
