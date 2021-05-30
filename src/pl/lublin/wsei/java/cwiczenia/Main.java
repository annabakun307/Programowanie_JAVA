package pl.lublin.wsei.java.czwiczenia;
import pl.lublin.wsei.java.cwiczenia.mylib.Account;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("anna Bakun");
        System.out.println(acc.getName());
        System.out.println(acc.translit("Вікторія"));
        System.out.println(acc.translit("Тетяна"));
        System.out.println(acc.translit("Марія"));
    }
}