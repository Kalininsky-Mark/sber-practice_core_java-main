package exeptions;

public class InvalidCardNumberExeption extends BankOnlineExeption{
    InvalidCardNumberExeption(){}
    InvalidCardNumberExeption(String message){
        super(message);
    }
}
