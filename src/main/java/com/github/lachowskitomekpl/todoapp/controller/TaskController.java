package com.github.lachowskitomekpl.todoapp.controller;

import com.github.lachowskitomekpl.todoapp.model.Task;
import com.github.lachowskitomekpl.todoapp.repository.TaskRepository;
import com.github.lachowskitomekpl.todoapp.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {
    @Autowired
    private final TaskService taskService;

    @Autowired
    private final TaskRepository taskRepository;

    @PostMapping("/tasks")
    ResponseEntity<Task> createTask(@RequestBody Task createTask){
        return ResponseEntity.ok(taskService.saveTask(createTask));
    }

    @GetMapping(path = "/tasks")
    public List<Task> getStudent(@RequestBody Task tasks) {
        return taskService.findAll(tasks);
    }

    @GetMapping("/tasks/{id}")
    ResponseEntity<Task> readTask(@PathVariable Long id){
        return ResponseEntity.ok( taskService.findById(id));
    }

//    @PutMapping("/tasks/{id}")
//    ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task toUpdate) {
//        if (taskService.existByid(id)) {//toUpdate.setId(id);
//            taskService.saveTask(toUpdate);
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

}
