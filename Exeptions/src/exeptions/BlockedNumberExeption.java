package exeptions;

public class BlockedNumberExeption extends BankOnlineExeption{
    BlockedNumberExeption(){}
    BlockedNumberExeption(String message){
        super(message);
    }
}
