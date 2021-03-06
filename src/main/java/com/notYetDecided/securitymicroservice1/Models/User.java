package com.notYetDecided.securitymicroservice1.Models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name ="USER_TABLE")
@Data
public class User {
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
     private String userName;
     private String password;
     private boolean active;
     private String roles;
}
