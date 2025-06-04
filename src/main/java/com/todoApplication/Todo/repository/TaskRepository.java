package com.todoApplication.Todo.repository;

import com.todoApplication.Todo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
