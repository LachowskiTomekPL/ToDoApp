package com.github.lachowskitomekpl.todoapp.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Tasks")
@RequiredArgsConstructor
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Description can't be empty")
    private String description;
    private boolean done;
}
