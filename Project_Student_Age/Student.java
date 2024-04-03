package Project_Student_Age;

public class Student {
    private int age;
    public void setAge (int a) {
        if (a >= 7 && a <= 27) {
            age = a;
        } 
    } 

    public int getAge () {
        return age;
    }
}
