package TASK_MANAGER;
import java.util.ArrayList;
import java.util.List;

public class TaskManager{
    private List<Task> tasks;
    private int nextId;
    
    public TaskManager()
    {
        tasks=new ArrayList<Task>();
        nextId=1;
    }
        
    public Task addTask(String title,String description,String priority,String status)
    {
        Task task=new Task( nextId++, title, description, priority, status);
        tasks.add(task);
        return task;
    }
    
     public Task editTask(int Id,String newtitle,String newdescription,String newpriority,String newstatus)
    {
        Task task=getId(Id);
        if(task!=null)
        {
            if(newtitle!=null && !newtitle.isEmpty()) task.setTitle(newtitle);
            
            if(newdescription!=null && !newdescription.isEmpty()) task.setDescription(newdescription);
            
            if(newpriority!=null && !newpriority.isEmpty()) task.setPriority(newpriority);
            
            if(newstatus!=null && !newstatus.isEmpty()) task.setStatus(newstatus);
        }
        return task;
    }
    
    public Task deleteTask(int id)
    {
        Task task = getId(id);
        if(task!=null)
        tasks.remove(task);
        return task; 
    }
    
    public List<Task> filterByPriority(String prior)
    {
        List<Task> filterList = new ArrayList<>();
        for(Task fil :tasks)
        {
        if(fil.getPriority().equalsIgnoreCase(prior))
        filterList.add(fil);
        }
        return filterList;
    }
    public Task getId(int id)
    {
        for(Task task:tasks)
        {
         if(task.getId()==id)   
            return task;
        }
        return null;
    }
    
    public List<Task> viewAllTasks()
    {
        return new ArrayList<>(tasks);
    }
}
