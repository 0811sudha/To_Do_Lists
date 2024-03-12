package to_do_List;
import java.util.ArrayList;
import java.util.Scanner;
public class ToDoMain {

	public static void main(String[] args)throws Exception {
		System.out.println("\t\tTo-Do List");
		System.out.println("\t\t----------");
		Scanner td=new Scanner(System.in);
		ArrayList<TaskList> taskLists=new ArrayList<TaskList>();
		int choices=6,n;
		do {
			System.out.println("\nTask is\n\t 1. Add Task \n\t 2. Remove Task \n\t 3. Updating Task \n\t 4. Display Tasks \n\t 5. How Many Task in particular Date \n\t 6. View Tasks Name");
			System.out.println("Enter Your choices");
			n=td.nextInt();
			switch(n) {
			case 1:
				taskLists.add(new TaskList());
				break;
			case 2:
				TaskList.remove(taskLists);
				break;
			case 3:
				TaskList.update(taskLists);
				break;
			case 4: 
				for(TaskList t:taskLists) {
					t.display();
				}
				break;
			case 5:
				TaskList.howManyTask(taskLists);
			case 6:
				TaskList.viewTaskName(taskLists);
				default :
					System.out.println("Please enter the number between 1 - 6");
			}
		}while(n<=choices);
		td.close();
	}	
}
