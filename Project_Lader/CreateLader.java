package Project_Lader;

public class CreateLader {
    public static void main(String[] args) {
        Lader.Bottom = 100;
        Lader lader1 = new Lader();
        Lader lader2 = new Lader();

        lader1.setTop(28);
        lader2.setTop(66);

        System.out.println("Lader1's Top is: "+lader1.getTop());
        System.out.println("Lader1's Bottom is: "+lader1.getBottom());

        System.out.println("Lader2's Top is: "+lader2.getTop());
        System.out.println("Lader2s's Bottom is: "+lader2.getBottom());
    }
}
