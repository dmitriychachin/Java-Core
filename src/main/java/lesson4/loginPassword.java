package lesson4;

import java.util.Objects;
import java.util.Scanner;


public class loginPassword {
    static Scanner iScanner = new Scanner(System.in);
    public static Boolean login(){
            System.out.println("Введите логин:");
            String login = iScanner.next();
            if (login.length() > 20){
                WrongLoginExeption.getInstance("Пароль должен быть меньше 20 символов");
            }
            else if (login == null){
                WrongLoginExeption.getInstance("");
            }
            else {
                return Boolean.TRUE;
            }
        return login();
    }

    public static Boolean password(){
            System.out.println("Введите пароль:");
            String password = iScanner.next();
            if (password.length() > 20){
                WrongPasswordExeption.getInstance("Длина пароля должна быть меньше 20 символов");
            }
            else if (password == null){
                WrongPasswordExeption.getInstance("");
            }
            else {
                return confrimPassword(password);
            }

        return password();
    }

    public static Boolean confrimPassword(String password){
            System.out.println("Введите пароль повторно:");
            String confrimPassword = iScanner.next();
            if (confrimPassword.length() < 20 && Objects.equals(password, confrimPassword)){
                return Boolean.TRUE;
            }
            else {
                WrongPasswordExeption.getInstance("");
            }
        return Boolean.FALSE;
    }

    public static Boolean registration(){
        Boolean login = login();
        Boolean password = password();
        if (login == Boolean.TRUE && password == Boolean.TRUE){
            return Boolean.TRUE;
        }
        else {
            return Boolean.FALSE;
        }
    }
}
