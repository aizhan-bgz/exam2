package task1;

import java.util.Scanner;

public class BasicUserAccount implements UserAccount {
    private String[] usernames;

    private String[] passwordes;
    private static Integer userNum;

    public BasicUserAccount() {
        usernames = new String[3];
        passwordes = new String[3];
    }

    public String[] getUsernames() {
        return usernames;
    }

    public void setUsernames(String[] usernames) {
        this.usernames = usernames;
    }

    public String[] getPasswordes() {
        return passwordes;
    }

    public void setPasswordes(String[] passwordes) {
        this.passwordes = passwordes;
    }

    Scanner scan = new Scanner(System.in);

    @Override
    public void createAccount() {
        System.out.print("Введите имя пользователя: ");
        scan.nextLine();
        String username = scan.nextLine();
        usernames[userNum] = username;

        System.out.print("Введите пароль: ");
        String password = scan.nextLine();
        passwordes[userNum] = password;

        userNum++;
        System.out.println("Добавлен новый пользователь: '" + username + "'");
    }

    @Override
    public void updateAccount() {
        System.out.println("Список пользователей: ");
        for (int i = 0; i < userNum; i++) {
            System.out.println((i + 1) + ". " + usernames[i]);
            System.out.println("Выберите номер для обновления");
            if (i < 0 || i > userNum) {
                System.out.println("Недопустимый номер, попробуйте еще раз");
                updateAccount();
            } else {
                Scanner scan = new Scanner(System.in);
                System.out.print("Новое имя пользователя: ");
                usernames[i - 1] = scan.nextLine();
                System.out.print("Новый пароль: ");
                passwordes[i - 1] = scan.nextLine();
                System.out.println("Пользователь '" + usernames[i - 1] + "' успешно обновлен");
            }
        }
    }

    @Override
    public void deleteAccount() {
        System.out.println("Список пользователей: ");
        for (int i = 0; i < userNum; i++) {
            System.out.println((i + 1) + ". " + usernames[i] + " " + passwordes[i]);
            System.out.print("Введите номер для удаления: ");
            int num = scan.nextInt() - 1;
            if (num < 0 || num > userNum) {
                System.out.println("Недопустимый номер, попробуйте еще раз");
                deleteAccount();
            } else {
                for (int j = num; j < userNum; j++) {
                    usernames[j] = null;
                    passwordes[j] = null;

                    usernames[j] = usernames[j + 1];
                    passwordes[j] = passwordes[j + 1];
                }
                System.out.println("Пользователь успешно удален");
                userNum--;
            }
        }
    }
    public static void printMenu() {
        System.out.println("\t\t\tМЕНЮ \n" +
                "1 - Создание нового пользователя\n" +
                "2 - Обновление пользователя\n" +
                "3 - Удаление пользователя\n" +
                "0 - Выход ");
    }

    public void action (int code) {
        switch (code) {
            case 0: break;
            case 1: {
                createAccount();
                printMenu();
                code = scan.nextInt();
                action(code);
            } break;
            case 2: {
                updateAccount();
                printMenu();
                code = scan.nextInt();
                action(code);
            } break;
            case 3: {
                deleteAccount();
                printMenu();
                code = scan.nextInt();
                action(code);
            } break;
            default: {
                System.out.println("Ошибка, повторите попытку");
                code = scan.nextInt();
                action(code);
            }
        }
    }
}
