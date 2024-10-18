package lection_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {
        if (userRegistrationCheck("a_1", "a1_", "a1_")) {
            System.out.println("Регистрация прошла успешно!");
        }
    }


    public static boolean userRegistrationCheck(String login, String password, String confirmPassword) {
        Pattern pattern = Pattern.compile("^[a-zA-Z\\d_]+$");
        Matcher matcher = pattern.matcher(login);
        try {
            if (login.length() >= 20) {
                throw new WrongLoginException("Длинна логина должна быть меньше 20 символов!");
            } else if (!matcher.matches()) {
                throw new WrongLoginException("Логин должен содержать только латинские буквы, цифры и знаки подчеркивания!");
            }
            matcher = pattern.matcher(password);
            if (password.length() >= 20) {
                throw new WrongPasswordException("Длинна пароля должна быть меньше 20 символов!");
            } else if (!matcher.matches()) {
                throw new WrongPasswordException("Пароль должен содержать только латинские буквы, цифры и знаки подчеркивания!");
            } else if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Правильно подтвердите пароль!");
            }
            return true;
        } catch (WrongPasswordException | WrongLoginException e) {
            e.printStackTrace();
            return false;
        }
    }
}
