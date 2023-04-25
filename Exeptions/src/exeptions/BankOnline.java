package exeptions;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankOnline {
    String[] blocked  = {"1111 1111 1111 1111", "2222 2222 2222 2222", "3333 3333 3333 3333"};
    public String send(String cardNumber, Double money) throws BlockedNumberExeption, InvalidCardNumberExeption,
            OutOfLimitTransferExeption, NegativTransferExeption, NullElementExeption{
        if(cardNumber == null){
            throw new NullElementExeption("Не введён номер карты");
        }
        if(money == null) {
            throw new NullElementExeption("Не введена сумма перевода");
        }
        Pattern p = Pattern.compile("((?:(?:\\d{4}[\\s ]){3}\\d{4}|\\d{16}))(?![\\d])" );
        Matcher m = p.matcher(cardNumber);
        if (!m.find()) {
            throw new InvalidCardNumberExeption("Неправильно введён номер карты");
        }
        if (Arrays.asList(blocked).contains(cardNumber)) {
            throw new BlockedNumberExeption("Указанная карта заблокирована");
        }
        if (money < 0) {
            throw new NegativTransferExeption("Указана отрицательная сумма перевода");
        }
        if (money > 50000) {
            throw new OutOfLimitTransferExeption("Слишком большая сумма перевода");
        }
        return "Перевод успешно завершён";
    }
}
