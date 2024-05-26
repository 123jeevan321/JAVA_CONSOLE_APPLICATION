package TASK_MANAGER;
public class Task {
    private int nextId;
    private String title;
    private String description;
    private String priority;
    private String status;
    public Task(int nextId, String title,String description,String priority,String status)
    {
        this.nextId=nextId;
        this.title=title;
        this.description=description;
        this.priority=priority;
        this.status=status;
    }
    public int getId()
    {
        return nextId;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description=description;
    }
    public String getPriority()
    {
        return priority;
    }
    public void setPriority(String priority)
    {
        this.priority=priority;
    }
    public String getStatus()
    {
        return status;
    }
     public void setStatus(String status)
    {
        this.status=status;
    }
    public String toString()
    {
        return "[Your Task Id is : "+ nextId + ", Title is :" + title +", Description :" + description + ", Priority :" +priority +", Status :"+ status +" ]";
    }
    
}
