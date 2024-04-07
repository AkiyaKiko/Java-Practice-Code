package Project_Callback;

/**
 * Msg
 */
public class Msg {

    /**
     * Sender
     */
    public class Sender {
        public void send(String message, MessageStatus msgstat) {
            int ACK = 1;
            if (ACK == 1){
                msgstat.succ();
            }else {
                msgstat.fail();
            }
        }
    }
    
    /**
     * MessageStatus
     */
    public interface MessageStatus {
        void succ();
        void fail();
    }

    public static void main(String[] args) {
        Msg msg = new Msg();
        Sender sender = msg.new Sender();
        sender.send("This is a test Message", new MessageStatus() {
            @Override
            public void succ() {
                // TODO Auto-generated method stub
                System.out.println("Message Sending Succussfully");
            }
            @Override
            public void fail() {
                // TODO Auto-generated method stub
                System.out.println("Message Sending Failed");
            }
        });

    }


}