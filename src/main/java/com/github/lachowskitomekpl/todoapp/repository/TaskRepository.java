package com.github.lachowskitomekpl.todoapp.repository;

import com.github.lachowskitomekpl.todoapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {


}
