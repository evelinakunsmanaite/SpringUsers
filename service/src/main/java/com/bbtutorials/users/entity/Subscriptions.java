package com.bbtutorials.users.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Subscriptions {
    @Id
    @Column
    private int id;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @Column (name = "name")
    @NotNull(message="{NotNull.User.name}")
    private String name;


    @Column (name = "status")
    @NotNull(message="{NotNull.User.status}")
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
