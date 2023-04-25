package exeptions;

public class BankOnlineExeption extends Exception{
    BankOnlineExeption() {}
    BankOnlineExeption(String message){
        super(message);
    }
}
