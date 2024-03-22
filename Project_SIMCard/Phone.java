package Project_SIMCard;

public class Phone {
    public static void main(String[] args) {
        SIM sim1 = new SIM(133332345365L);
        MobileTelephone phone = new MobileTelephone();
        phone.setSIM(sim1);
        System.out.println(phone.lookNum());

        SIM sim2 = new SIM(17756473421L);
        phone.setSIM(sim2);
        System.out.println(phone.lookNum());
    }
}
