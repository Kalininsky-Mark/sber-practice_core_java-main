package exeptions;

public class NegativeTransferException extends BankOnlineException {
    public NegativeTransferException(String message){
        super(message);
    }
}
