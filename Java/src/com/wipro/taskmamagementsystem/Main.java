package com.wipro.taskmamagementsystem;

 import java.util.List;

import com.wipro.taskmamagementsystem.Task.Priority;
import com.wipro.taskmamagementsystem.Task.Status;

public class Main {
	public static void main(String[] args) {
		TaskManagementSystem system = new TaskManagementSystem();

        Employee employee1 = new Employee(1, "A", "HR");
        Employee employee2 = new Employee(2, "B", "IT");
        system.addEmployee(employee1);
        system.addEmployee(employee2);

        
        Task task1 = new Task(1, "Prepare HR report", Priority.HIGH, Status.PENDING);
        Task task2 = new Task(2, "Fix network issue", Priority.MEDIUM, Status.PENDING);
 
        system.assignTask(1, task1);
        system.assignTask(2, task2);
 
        // All Tasks
        List<Task> prioritizedTasks = system.getTasksByPriority();
        for (Task task : prioritizedTasks) {
            System.out.println(task);
        }

        // Task by Employee
        List<Task> Atasks = system.getTasksByEmployee("A");
        for (Task task : Atasks) {
            System.out.println(task);
        }

	}
}
