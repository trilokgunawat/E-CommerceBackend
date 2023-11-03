package com.trilok.productservice.InheritanceExample.JoinTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "join_Instructor")
@PrimaryKeyJoinColumn(name = "user_id")
public class Instructor extends User{
    private boolean isHandsome;

}
