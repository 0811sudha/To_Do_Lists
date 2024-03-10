package to_do_List;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class TaskList {
//	private ArrayList<Task> tasks;
	String taskname;
	Date duedate=new Date();
	int priority;
	TaskList newTask;
	Task tasks;
	Scanner tl=new Scanner(System.in);
//	public TaskList(){
//		this.tasks=new ArrayList<>();
//	}
	public void add(ArrayList<TaskList> taskLists){
		System.out.println("Enter the Task Name");
		taskname=tl.next();
		System.out.println("Enter the date in the format dd/mm/yyyy");
		String dt=tl.next();
		SimpleDateFormat dtfr=new SimpleDateFormat("dd/MM/yyyy");
		try {
			duedate=dtfr.parse(dt);
		}catch(ParseException e) {
			System.out.println(e);
		}
		System.out.println("Set the priority 1 - 5");
		priority =tl.nextInt();
		new Task(taskname, duedate, priority);
        taskLists.add(newTask);
		System.out.println("Task added successfully!");
	}
	public void remove() {
		
	}
	public void update() {
		
	}
	public void display() {
		System.out.println("Task Name : "+tasks.getTaskName()+"Date : "+tasks.getDueDate()+"Status : "+tasks.getStatus()+"Priority : "+tasks.getPriority());
	}
	
}
