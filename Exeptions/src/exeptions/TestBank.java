package exeptions;

public class TestBank {
    public static void main(String[] args) throws BlockedNumberExeption, InvalidCardNumberExeption,
            OutOfLimitTransferExeption, NegativTransferExeption, NullElementExeption {
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
        }catch (NegativTransferExeption exeption){
            System.out.println(exeption.getMessage());
        }
        try {
            bankOnline.send(number1,sum2);
        }catch (OutOfLimitTransferExeption exeption){
            System.out.println(exeption.getMessage());
        }
        try {
            bankOnline.send(num,sum3);
        }catch (NullElementExeption exeption){
            System.out.println(exeption.getMessage());
        }
        try {
            bankOnline.send(number3,sum3);
        }catch (InvalidCardNumberExeption exeption){
            System.out.println(exeption.getMessage());
        }
        try {
            bankOnline.send(number2,sum3);
        }catch (BlockedNumberExeption exeption){
            System.out.println(exeption.getMessage());
        }
        try {
            System.out.println(bankOnline.send(number1,sum3));
        }catch (BlockedNumberExeption exeption){
            System.out.println(exeption.getMessage());
        }
    }
}
