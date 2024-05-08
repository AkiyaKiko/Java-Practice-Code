package Project_TaskDriver;

class Task implements Priority{
    String name;
    private int priority;
    //-----------------------------------------------------------------
    // Sets up this task with a medium priority level.
    //-----------------------------------------------------------------
    public Task(String taskName){
       name = taskName;
       priority = MED_PRIORITY;
    }
    //-----------------------------------------------------------------
    // Returns this task's name.
    //-----------------------------------------------------------------
    String getName(){
       return name;
    }
       //-----------------------------------------------------------------
       // Sets this task's priority level.
       //-----------------------------------------------------------------
    public void setPriority(int value){
          priority = value;
    }
       //-----------------------------------------------------------------
       // Returns this task's priority level.
       //-----------------------------------------------------------------
    public int getPriority(){
          return priority;
    }

}
public class Project_TaskDriver{
    public static void main(String[] args) {
        Task task1 = new Task("Homework");
        task1.setPriority(7);
        Task task2 = new Task("Eat Launch");
        task2.setPriority(Priority.MIN_PRIORITY);
        Task task3 = new Task("Attend Class");
        task3.setPriority(Priority.MAX_PRIORITY);
        Task task4 = new Task("Ned's Project");
        task4.setPriority(4);
        System.out.println("TO-DO\n-----");
        System.out.println(task1.getName() + " \tpriority: " + task1.getPriority());
        System.out.println(task2.getName() + " \tpriority: " + task2.getPriority());
        System.out.println(task3.getName() + " \tpriority: " + task3.getPriority());
        System.out.println(task4.getName() + " \tpriority: " + task4.getPriority());
    }
}
