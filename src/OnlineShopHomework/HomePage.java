package OnlineShopHomework;

import java.util.Scanner;

import static OnlineShopHomework.LogInMain.*;

public class HomePage {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        char pageChose = '0';

        System.out.print("HOME PAGE \n[l]Login\n[c]Create account");
        //System.out.print("\n[s]Shoping Categories");
        System.out.print("\n[e]Exit\nyour chose? ");

        do {
            pageChose = scanner.next().charAt(0);

            switch (pageChose) {
                case 'l':
                    System.out.println("LOGIN PAGE");
                    LogInMain.loginMain(true);
                    break;

                case 'c':
                    System.out.println("Create Account");
                    SignInMain.main(true);
                    break;

                // case 's':
                //     if (LogInMain.loginMain(false)){
                //         CategoriesPage.showMenu();
                //
                //     } else
                //     System.out.println("Shoping Categories available after LogingIn\nChoose from HOME PAGE menu");
                //     HomePage.showMenu();
                //     break;

                case 'e':
                    System.out.println("**************");
                    break;

                default:
                    System.out.println("neteidingai pasirinktas operacijos numeris. Bandykite dar karta");
                    break;
            }


        } while (pageChose != 'e');
    }
    }
