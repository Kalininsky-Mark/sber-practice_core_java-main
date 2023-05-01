package exeptions;

public class BlockedNumberException extends BankOnlineException {
    public BlockedNumberException(String message){
        super(message);
    }
}
