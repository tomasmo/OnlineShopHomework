package OnlineShopHomework;

import java.util.Scanner;

public class LogInMain {
    public static boolean loginMain(boolean args) {
        Scanner scaneris = new Scanner(System.in);
        int i = 1;
        boolean logedIn = false;
       // do {
            System.out.println("Norėdami prisijungti suveskite elektroninį paštą: ");
            String email = scaneris.nextLine();
            LoginForm.loginemail = email;

            System.out.println("Norėdami prisijungti suveskite slaptažodį: ");
            String password = scaneris.nextLine();
            LoginForm.loginpassword = password;

            LoginForm log = new LoginForm();
            log.loginTry(email, password);
            String loginInfo = LoginForm.loginemail + LoginForm.loginpassword;

            if (loginInfo.equals(PasswordManager.readPassword())) {
                System.out.println("Prisijungti pavyko\n******************");
                logedIn = true;
                CategoriesPage.showMenu();
               // break;
            } else {
                System.out.println("Prisijungti nepavyko\n******************");
            }
            i++;
      //  } while (i <= 3);
        HomePage.showMenu();
        return logedIn;
    }
}
