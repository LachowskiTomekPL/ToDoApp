package com.github.lachowskitomekpl.todoapp.service;

import com.github.lachowskitomekpl.todoapp.model.Task;
import com.github.lachowskitomekpl.todoapp.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

public Task saveTask(Task newTask){
    return taskRepository.save(newTask);
}

public Optional<Task> existByid(Long id){
    return taskRepository.findById(id);
}
public Task findById(Long id){
    return taskRepository.findById(id).orElseThrow();
}

}
