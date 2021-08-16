public class Main {
    public static void main(String[] args) {

        int account = 10_000;
        int accountRefill = 2_000;
        int bonus = 1;
        int money = 200;


        if (accountRefill > 1000) {
            account = account + accountRefill + bonus * accountRefill / money;

        } else {
            account = account + accountRefill;

        }

        System.out.println(account);


    }


}
