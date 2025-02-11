package com.example.todo.service;

import com.example.todo.model.Task;
import com.example.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task updatedTask) {
        return taskRepository.findById(id).map(task -> {
            if (updatedTask.getTitle() != null) {
                task.setTitle(updatedTask.getTitle());
            }

            if (updatedTask.isCompleted() != task.isCompleted()) {
                task.setCompleted(updatedTask.isCompleted());
            }

            return taskRepository.save(task);
        }).orElse(null);
    }


    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}

