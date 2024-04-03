package Project_Student_Age;
import java.lang.Integer;

public class Example {
public static void main(String[] args) {
    Student Zhang = new Student();
    Student Geng = new Student();

    Zhang.setAge(11);
    Geng.setAge(22);

    int ZhangeAge = Zhang.getAge();
    int GengAge = Geng.getAge();

    System.out.println(Integer.toString(ZhangeAge)+'\n'+Integer.toString(GengAge));
}
}
