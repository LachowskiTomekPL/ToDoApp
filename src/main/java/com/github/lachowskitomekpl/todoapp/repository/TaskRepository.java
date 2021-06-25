package com.github.lachowskitomekpl.todoapp.repository;

import com.github.lachowskitomekpl.todoapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {


}
