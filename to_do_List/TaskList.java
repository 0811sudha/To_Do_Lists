package to_do_List;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TaskList {
    String taskname;
	static Date duedate=new Date();
	int priority;
    static Scanner tl=new Scanner(System.in);
	Task tk; //Associate the instance of Task class object in TaskList class
	TaskList(){
		System.out.println("Enter the Task Name");
		taskname=tl.next();
		System.out.println("Enter the Due Date in the format dd/mm/yyyy");
		String dt=tl.next();
		SimpleDateFormat dtfr=new SimpleDateFormat("dd/MM/yyyy");
		try {
			duedate=dtfr.parse(dt);
		}catch(ParseException e) {
			System.out.println(e);
		}
		System.out.println("Set the priority 1 - 5");
		priority =tl.nextInt();
		tk=new Task(taskname,duedate,priority);
		System.out.println("Task added successfully!");
	}	
	public static void remove(ArrayList<TaskList> taskLists) { 
		try {
			for(TaskList tk:taskLists) {
				if(tk.getTask().getStatus()==true) {
					taskLists.remove(tk);
					System.out.println("The Task is removed");
					return;
				}
			}
		
			System.out.println("The Task is not found");
		
		}catch (NoSuchElementException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
	}
		
	public static void update(ArrayList<TaskList> taskLists) {
		System.out.println("Enter the Task Name");
		String tknameupdate=tl.next();
		try {
            boolean taskFound = false;
            for (TaskList tk : taskLists) {
                if (tk.getTask().getTaskName().equals(tknameupdate)) {
                    tk.getTask().setStatus(true);
                    System.out.println("The Task is set");
                    taskFound = true;
                    break; 
                }
            }

            if (!taskFound) {
                System.out.println("The Task is Not Found");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
	
	public void display() {
		System.out.println("Task Name : "+tk.getTaskName()+"\nDate : "+tk.getDueDate()+"\nStatus : "+tk.getStatus()+"\nPriority : "+tk.getPriority());
	}
	public static void howManyTask(ArrayList<TaskList> taskLists) {
		System.out.println("Enter the Date");
		String dt=tl.next();
		SimpleDateFormat dtf=new SimpleDateFormat("dd/MM/yyyy");
		int task_count=0;
		try {
			 duedate =dtf.parse(dt);
		}catch(ParseException e) {
			System.out.println(e);
		}
		try {
			for(TaskList tk : taskLists) {
				if(tk.getTask().getDueDate().equals(duedate)) {
					task_count++;
				}
			}			
			System.out.println("The Number of tasks is "+task_count+" : "+duedate);
		} 
		catch (Exception e) {
			System.out.println("Invalid Date. Please enter correct date");
		}
	}
	public static void viewTaskName(ArrayList<TaskList> taskLists) {
		for(TaskList tk : taskLists) {
			System.out.println(tk.getTask().getTaskName());
		}
	}
	public Task getTask() {
        return tk;
    }
	
}
