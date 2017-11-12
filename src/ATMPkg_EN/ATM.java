package ATMPkg_EN;

import java.util.Scanner;

/**
 * Created by Mohammed on 10/11/2017.
 * <p>
 * This is a simple ATM machine which it asks users to enter their account No and account password to withdraw money form
 * ATM machine with different banknote.
 */
public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your bank account number: ");
        int userAccountNo = scanner.nextInt();
        System.out.println("Please enter your account password: ");
        int userPassword = scanner.nextInt();
        ATMAccessControl(userAccountNo, userPassword);

    }


    public static void ATMAccessControl(int accountNo, int password) {

        int usersAccountNo[] = {111, 222, 333, 444, 555};
        int usersPasswords[] = {123, 456, 789, 809, 234};
        boolean control = false;
        for (int i = 0; i < 5; i++) {
            // Double check if the user is exist or not
            if (usersAccountNo[i] == accountNo && usersPasswords[i] == password) {

                //Money withdraw screen call
                ATMMoneyWithdraw();
                control = true;
            }
        }

        if (!control) {
            System.out.println("Sorry! you are not registered as our bank customer.");
        }
        System.out.println(" ");
    }

    public static void ATMMoneyWithdraw() {
        // ATM total mount is 1 000 000 IQD;
        int ATMTotalMount = 1000000;
        // Type of banknotes and its counts inside ATM, initially each banknotes type have 200,000 IQD
        // Ex: their is 8 pieces from 25,000 IQD which makes 200,000 IQD and so on ..

        int banknoteCount25K = 8;
        int banknoteCount10K = 20;
        int banknoteCount5K = 40;
        int banknoteCount1K = 200;
        int banknoteCount500 = 400;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello.. Please enter the mount you want to withdraw: ");
        int userMountWithdraw = scanner.nextInt();
        // Double check the entered mount by the user
        if (userMountWithdraw < 500) {
            System.out.println("Wrong mount! Please make sure to enter mount at least 500 IQD: ");
            ATMMoneyWithdraw();

        }
        // Again double check the entered mount by the user
        if (userMountWithdraw > ATMTotalMount) {
            System.out.println("Sorry! the mount you want to withdraw is bigger from total ATM mount. Please enter a small mount: ");
            ATMMoneyWithdraw();

        } else {

            int banknoteOut25K = 0;
            int banknoteOut10K = 0;
            int banknoteOut5K = 0;
            int banknoteOut1K = 0;
            int banknoteOut500 = 0;


            // 570 is number of total pieces inside ATM
            for (int i = 0; i <= 570; i++) {
                if (userMountWithdraw >= 25000 && banknoteCount25K != 0) {
                    // Withdraw money from specific banknote
                    userMountWithdraw = userMountWithdraw - 25000;
                    // Detract 1 from 25,000 banknote pieces
                    banknoteCount25K = banknoteCount25K - 1;
                    // Calculate the withdrawen pieces of banknotes
                    banknoteOut25K = banknoteOut25K + 1;
                } else if (userMountWithdraw >= 10000 && banknoteCount10K != 0) {
                    userMountWithdraw = userMountWithdraw - 10000;
                    banknoteCount10K = banknoteCount10K - 1;
                    banknoteOut10K = banknoteOut10K + 1;

                } else if (userMountWithdraw >= 5000 && banknoteCount5K != 0) {
                    userMountWithdraw = userMountWithdraw - 5000;
                    banknoteCount5K = banknoteCount5K - 1;
                    banknoteOut5K = banknoteOut5K + 1;

                } else if (userMountWithdraw >= 1000 && banknoteCount1K != 0) {
                    userMountWithdraw = userMountWithdraw - 1000;
                    banknoteCount1K = banknoteCount1K - 1;
                    banknoteOut1K = banknoteOut1K + 1;

                } else if (userMountWithdraw >= 500 && banknoteCount500 != 0) {
                    userMountWithdraw = userMountWithdraw - 500;
                    banknoteCount500 = banknoteCount500 - 1;
                    banknoteOut500 = banknoteOut500 + 1;
                }
            }
            int totalWithdrawenMount = (banknoteOut25K * 25000 + banknoteOut10K * 10000
                    + banknoteOut5K * 5000 + banknoteOut1K * 1000 + banknoteOut500 * 500);
            ATMTotalMount = ATMTotalMount - totalWithdrawenMount;



            System.out.println("Total Withdrawen Mount: " + totalWithdrawenMount);
            System.out.println("Remaining Mount Inside ATM: " + ATMTotalMount);
            System.out.println("----------------------");

            System.out.println("25,000 IQD: " + banknoteOut25K);
            System.out.println("10,000 IQD: " + banknoteOut10K);
            System.out.println("5,000 IQD: " + banknoteOut5K);
            System.out.println("1,000 IQD: " + banknoteOut1K);
            System.out.println("500 IQD: " + banknoteOut500);
            System.out.println("----------------------");
            System.out.println("Total: " + totalWithdrawenMount);

        }



    }

}
