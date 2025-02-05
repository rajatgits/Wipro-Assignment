package com.wipro.taskmamagementsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import com.wipro.taskmamagementsystem.Task.Status;

public class TaskManagementSystem {
	private HashMap<Integer, Employee> employees;
    private HashMap<Integer, List<Task>> employeeTasks;
    private PriorityQueue<Task> priorityQueue;
    private LinkedList<Task> pendingTasks;

    public TaskManagementSystem() {
        employees = new HashMap<>();
        employeeTasks = new HashMap<>();
        priorityQueue = new PriorityQueue<>();
        pendingTasks = new LinkedList<>();
    }

    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public void assignTask(int employeeId, Task task) {
        if (employees.containsKey(employeeId)) {
            List<Task> tasks = employeeTasks.getOrDefault(employeeId, new ArrayList<>());
            tasks.add(task);
            employeeTasks.put(employeeId, tasks);
            priorityQueue.add(task); 
            pendingTasks.add(task); 
        } else {
            System.out.println("Employee not found.");
        }
    }

    public List<Task> getTasksByPriority() {
        List<Task> prioritizedTasks = new ArrayList<>();
        while (!priorityQueue.isEmpty()) {
            prioritizedTasks.add(priorityQueue.poll());
        }
        priorityQueue.addAll(prioritizedTasks); 
        return prioritizedTasks;
    }

    public List<Task> getTasksByEmployee(String employeeName) {
        List<Task> employeeTasksList = new ArrayList<>();
        for (Map.Entry<Integer, List<Task>> entry : employeeTasks.entrySet()) {
            Employee employee = employees.get(entry.getKey());
            if (employee.getName().equals(employeeName)) {
                employeeTasksList.addAll(entry.getValue());
            }
        }
        return employeeTasksList;
    }

    public List<Task> getTasksByDepartment(String department) {
        List<Task> departmentTasks = new ArrayList<>();
        for (Map.Entry<Integer, List<Task>> entry : employeeTasks.entrySet()) {
            Employee employee = employees.get(entry.getKey());
            if (employee.getDepartment().equals(department)) {
                departmentTasks.addAll(entry.getValue());
            }
        }
        return departmentTasks;
    }

     public void removeCompletedTasks() {
        Iterator<Task> iterator = pendingTasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getStatus() == Status.COMPLETED) {
                iterator.remove();
            }
        }
    }

     public List<Task> getPendingTasks() {
        return new ArrayList<>(pendingTasks); 
    }
 
}
