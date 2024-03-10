package to_do_List;
import java.util.ArrayList;
import java.util.Scanner;
public class ToDoMain {

	public static void main(String[] args) {
		System.out.println("\t\tTo-Do List");
		System.out.println("\t\t----------");
		Scanner td=new Scanner(System.in);
		ArrayList<TaskList> taskLists=new ArrayList<TaskList>();
		//ArrayList<Task> tasks =new ArrayList<Task>();
		TaskList lists=new TaskList();
		int choices=4,n;
		do {
			System.out.println("Task is\n\t 1. Add Task \n\t 2. Remove Task \n\t 3. Updating Task \n\t 4. Display Tasks");
			System.out.println("Enter Your choices");
			n=td.nextInt();
			switch(n) {
			case 1:
				lists.add(taskLists);
				break;
			case 2:
				lists.remove();
				break;
			case 3:
				lists.update();
				break;
			case 4: 
				for(TaskList t:taskLists) {
					t.display();
				}
				break;
				default :
					System.out.println("Please enter the number between 1 - 4");
			}
		}while(n<=choices);
		td.close();
	}

}
