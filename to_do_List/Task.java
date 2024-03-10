package to_do_List;

import java.util.Date;

public class Task {
	private String task_Name;
	private Date due_date;
	private boolean status;
	private int priority;
	Task(String task_Name,Date due_date,int priority){
		this.task_Name=task_Name;
		this.due_date=due_date;
		this.status=false;
		this.priority=priority;
	}
	void setTaskName(String task_Name) {
		this.task_Name=task_Name;
	}
	String getTaskName() {
		return task_Name;
	}
	void setDueDate(Date due_date) {
		this.due_date=due_date;
	}
	Date getDueDate() {
		return due_date;
	}
	void setStatus(boolean status) {
		this.status=status;
	}
	boolean getStatus() {
		return status;
	}
	void setPriority(int priority) {
		this.priority=priority;
	}
	int getPriority() {
		return priority;
	}
	public void display() {
		System.out.println("Task Name : "+task_Name+"Date : "+due_date+"Status : "+status+"Priority : "+priority);
	}
	
}
