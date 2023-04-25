package exeptions;

public class NegativTransferExeption extends BankOnlineExeption{
    NegativTransferExeption(){}
    NegativTransferExeption(String message){
        super(message);
    }
}
