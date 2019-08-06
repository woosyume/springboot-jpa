package com.rakuten.internship.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TODO")
public class Todo {
    @Id
    @GeneratedValue
    private Long id;    
    private String title;
    private String description;
}