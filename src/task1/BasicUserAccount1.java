package task1;

public class BasicUserAccount1 implements UserAccount{

    private String username;

    private String password;
    private static Integer userNum;

    public BasicUserAccount1() {

    }

    public BasicUserAccount1(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void createAccount() {



    }

    @Override
    public void updateAccount() {

    }

    @Override
    public void deleteAccount() {

    }
}
