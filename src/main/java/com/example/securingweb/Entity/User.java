package com.example.securingweb.Entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "my_users")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private boolean active;

    @Getter
    @Setter
    private String phone_number;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles = new HashSet<>();


    public User(){

    }


    public User(String username, String password, Role role){
        this.username = username;
        this.password = password;
        roles.add(role);
    }

    public boolean getActive(){
        return active;
    }
}
