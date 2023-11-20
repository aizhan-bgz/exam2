package task1;

import java.util.Scanner;

public class UserAccountManager {
    public static void main(String[] args) {
        BasicUserAccount basicUserAccount = new BasicUserAccount();

        Scanner scan = new Scanner(System.in);
        basicUserAccount.printMenu();

        Integer code = scan.nextInt();
        basicUserAccount.action(code);





    }
}
