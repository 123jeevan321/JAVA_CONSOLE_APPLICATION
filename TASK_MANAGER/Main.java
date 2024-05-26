package TASK_MANAGER;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Add Task");
            System.out.println("2.Edit Task");
            System.out.println("3.Delete Task");
            System.out.println("4.View All Task");
            System.out.println("5.Filter Task By Priority");
            System.out.println("6.Exit");
            System.out.println("Enter the Option : ");
            String option =scan.nextLine();

            switch (option) {
                case "1":
                System.out.println("Enter the Task :");
                String title=scan.nextLine();
                System.out.println("Enter Description of the Task :");
                String description=scan.nextLine();
                System.out.println("Enter the Priority (HIGH/MEDIUM/LOW) :");
                String priority=scan.nextLine();
                System.out.println("Enter the Status (Pending / In Progress / Completed)");
                String status=scan.nextLine();
                Task task=taskManager.addTask(title,description,priority,status);
                System.out.println("Task Added Successfully :"+ task);
                    break;
                case "2":
                System.out.println("Enter the Task Id to Edit :");
                int editId=Integer.parseInt(scan.nextLine());
                System.out.println("Enter the New Task  Or Leave Blank:");
                String newtitle=scan.nextLine();
                System.out.println("Enter New  Description of the Task  Or Leave Blank:");
                String newdescription=scan.nextLine();
                System.out.println("Enter the New Priority (HIGH/MEDIUM/LOW)  Or Leave Blank:");
                String newpriority=scan.nextLine();
                System.out.println("Enter the New Status (Pending / In Progress / Completed) Or Leave Blank");
                String newstatus=scan.nextLine();   
                Task edittask= taskManager.editTask(editId,newtitle,newdescription,newpriority,newstatus);
                if(edittask!=null)
                System.out.println("Successfully edited :"+ edittask);
                else
                System.out.println("The Edit ID is Not Found");
                break;
                case "3":
                    System.out.println("Enter the Task Id to Delete :");
                    int deleteId=Integer.parseInt(scan.nextLine());
                    Task deletetask = taskManager.deleteTask(deleteId);
                    if(deletetask!=null) System.out.println("Deleted the Task Successfully "+ deletetask);
                    else System.out.println("Delet ID is Not Found");
                break;
                case "4":
                    List<Task> alltask=taskManager.viewAllTasks();
                    for(Task t:alltask)
                    {
                        System.out.println(t);
                    }
                break;
                case "5":
                    System.out.println("Enter the Priority (HIGH/MEDIUM/LOW) to Filter");
                    String prior = scan.nextLine();
                    List<Task> filtered=taskManager.filterByPriority(prior);
                    if(filtered!=null  && !filtered.isEmpty())
                    {
                    for(Task f :filtered)
                    System.out.println(f);
                    }
                    else System.out.println("None of the Priority is there");
                break;
                case "6":
                    System.out.println("Exiting Task Manager ,Goodbye!");
                   scan.close();
                   return;
                
                default:
                System.out.println("You Were Entered a Wrong Option, Please Enter a Correct Option");
                    break;
            }
        }
    }
}
