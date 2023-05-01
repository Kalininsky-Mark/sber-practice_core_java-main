package exeptions;

public class TestBank {
    public static void main(String[] args){
        BankOnline bankOnline = new BankOnline();
        String number1 = "2111 1111 1111 1111";
        String number2 = "1111 1111 1111 1111";
        String number3 = "1";
        double sum1 = -1;
        double sum2 = 5000000;
        double sum3 = 500;
        String num = null;
        try {
            bankOnline.send(number1,sum1);
        }catch (BlockedNumberException | InvalidCardNumberException | OutOfLimitTransferException |
                NegativeTransferException | NullElementException exception){
            System.out.println(exception.getMessage());
        }
    }
}
