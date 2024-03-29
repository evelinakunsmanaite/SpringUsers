package com.bbtutorials.users.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


import lombok.Data;

@Entity
@Data
public class Users {
	
	@Id
	@Column
    private int id;

    @Column (name = "FIRST_NAME")
    @NotNull(message="{NotNull.User.firstName}")
    private String firstName;
    
    @Column (name = "LAST_NAME")
    @NotNull(message="{NotNull.User.lastName}")
    private String lastName;

    @Column (name = "EMAIL")
    @NotNull(message="{NotNull.User.email}")
    private String email;

}
