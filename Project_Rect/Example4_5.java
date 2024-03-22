package Project_Rect;
import java.util.*;

public class Example4_5 {
    public static void main(String[] args) {
        Rect ractangle = new Rect();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please split the doudle type num with space: 1.width 2.height");
        ractangle.width = scan.nextDouble();
        ractangle.height = scan.nextDouble();
        double area = ractangle.getArea();
        System.out.print("The Area of the Ractangle is: "+area+"\n");
        

        Lader lader = new Lader();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please split the doudle type num with space: 1.above 2.bottom 3.height");
        lader.above = scan1.nextDouble();
        lader.bottom = scan1.nextDouble();
        lader.height = scan1.nextDouble();
        double area1 = lader.getArea();
        System.out.println("The Area of the lader is: "+area1+"\n");
        scan.close();
        scan1.close();
    }
}
