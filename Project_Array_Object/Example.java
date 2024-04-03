package Project_Array_Object;

public class Example {
    public static void main(String[] args) {
        Student array[] = new Student[10];
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Student();
            array[i].number = 101+i;

        }

        for (int j = 0; j < array.length; ++j) {
            System.out.println(array[j].number);
        }
    }
}
