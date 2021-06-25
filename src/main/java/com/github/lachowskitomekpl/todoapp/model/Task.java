package com.github.lachowskitomekpl.todoapp.model;

import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Tasks")
@RequiredArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String decription;
    private boolean done;
}
