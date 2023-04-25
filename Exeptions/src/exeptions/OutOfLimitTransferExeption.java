package exeptions;

public class OutOfLimitTransferExeption extends BankOnlineExeption{
    OutOfLimitTransferExeption(){}
    OutOfLimitTransferExeption(String message){
        super(message);
    }
}
