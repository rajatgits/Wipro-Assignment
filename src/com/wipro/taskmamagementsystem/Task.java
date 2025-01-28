package com.wipro.taskmamagementsystem;

public class Task implements Comparable<Task>{
	private int id;
    private String description;
    private Priority priority; 
    private Status status;
    
    enum Priority { HIGH, MEDIUM, LOW }
    enum Status { PENDING, IN_PROGRESS, COMPLETED }
    
    public Task(int id, String description, Priority priority, Status status) {
		this.id = id;
		this.description = description;
		this.priority = priority;
		this.status = status;
	}
    
	@Override
	public String toString() {
		return "Task [id=" + id + ", description=" + description + ", priority=" + priority + ", status=" + status
				+ "]";
	}

	public int getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Priority getPriority() {
		return priority;
	}
	
	public Status getStatus() {
		return status;
	}
	
	@Override
    public int compareTo(Task other) {
        return this.priority.compareTo(other.priority); 
    }
}
