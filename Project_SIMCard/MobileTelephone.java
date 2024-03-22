package Project_SIMCard;

public class MobileTelephone {
    SIM sim;
    void setSIM(SIM card) {
        sim = card;

    }

    long lookNum() {
        return sim.getNumber();
    }
    
}
