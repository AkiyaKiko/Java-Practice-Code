package Project_SIMCard;

/**
 * SIM
 */
public class SIM {

    long number;
    SIM(long number){
        this.number = number;

    }

    long getNumber(){
        return number;
    }

    String getCorp() {
        return "Unicom";
    }
}